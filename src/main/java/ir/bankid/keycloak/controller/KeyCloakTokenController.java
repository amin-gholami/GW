package ir.bankid.keycloak.controller;

import ir.bankid.keycloak.model.req.BusinessAccessTokenRequest;
import ir.bankid.keycloak.model.res.AccessTokenResponse;
import ir.bankid.keycloak.model.res.Response;
import ir.bankid.keycloak.service.KeyCloakTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class KeyCloakTokenController {
    private final KeyCloakTokenService keyCloakTokenService;
    @PostMapping("/token")
    public ResponseEntity<Response<AccessTokenResponse>> getToken(HttpServletRequest request, @RequestBody BusinessAccessTokenRequest businessAccessTokenRequest) {

        AccessTokenResponse accessTokenResponse = keyCloakTokenService.getToken(businessAccessTokenRequest);
        return new ResponseEntity<>(new Response<AccessTokenResponse>().build().setMessage(accessTokenResponse).setPath(request.getRequestURI()), HttpStatus.OK);

    }
}
