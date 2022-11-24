package ir.bankid.keycloak.repository;

import ir.bankid.keycloak.errorHandler.ErrorHandler;
import ir.bankid.keycloak.model.req.AccessTokenRequest;
import ir.bankid.keycloak.model.res.AccessTokenResponse;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Repository
public class KeyClientTokenRepository {
    private final RestTemplate restTemplate;
    private final Environment environment;
    private final ErrorHandler errorHandler;

    public KeyClientTokenRepository(RestTemplate restTemplate, Environment environment, ErrorHandler errorHandler) {
        this.restTemplate = restTemplate;
        this.environment = environment;
        this.errorHandler = errorHandler;
    }

    public AccessTokenResponse getToken(String realm, AccessTokenRequest accessTokenRequest) {
        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<String, String>();
        requestBody.add("client_id", accessTokenRequest.getClient_id());
        requestBody.add("client_secret", "vpj6q979C27a92H6fZArCChQCAEHCy4p");
        requestBody.add("password", accessTokenRequest.getPassword());
        requestBody.add("grant_type", accessTokenRequest.getGrant_type());
        requestBody.add("username", accessTokenRequest.getUsername());
        HttpEntity formEntity = new HttpEntity<MultiValueMap<String, String>>(requestBody, setHeaders());
        String url = environment.getProperty("keycloak.auth-server-url") + "/realms/" + realm + "/protocol/openid-connect/token";
        restTemplate.setErrorHandler(errorHandler);
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        return restTemplate.exchange(url, HttpMethod.POST, formEntity, AccessTokenResponse.class).getBody();
    }

    private HttpHeaders setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        return headers;
    }
}
