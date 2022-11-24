package ir.bankid.keycloak.service;

import ir.bankid.keycloak.model.req.AccessTokenRequest;
import ir.bankid.keycloak.model.req.BusinessAccessTokenRequest;
import ir.bankid.keycloak.model.res.AccessTokenResponse;
import ir.bankid.keycloak.repository.KeyClientTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KeyCloakTokenService {
    private final KeyClientTokenRepository keyClientTokenRepository;
    private final Environment environment;

    public AccessTokenResponse getToken(BusinessAccessTokenRequest businessAccessTokenRequest) {
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
        accessTokenRequest.setClient_id(businessAccessTokenRequest.getClient_id());
        accessTokenRequest.setGrant_type("password");
        accessTokenRequest.setUsername(businessAccessTokenRequest.getUsername());
        accessTokenRequest.setPassword(businessAccessTokenRequest.getPassword());
        return keyClientTokenRepository.getToken(environment.getProperty("keycloak.realm"), accessTokenRequest);
    }

}
