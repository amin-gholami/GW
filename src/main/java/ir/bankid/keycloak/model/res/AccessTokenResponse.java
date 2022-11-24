package ir.bankid.keycloak.model.res;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenResponse {
    public String access_token;
    public int expires_in;
    public int refresh_expires_in;
    public String refresh_token;
    public String token_type;
    @JsonProperty("not-before-policy")
    public int notBeforePolicy;
    public String session_state;
    public String scope;
}

