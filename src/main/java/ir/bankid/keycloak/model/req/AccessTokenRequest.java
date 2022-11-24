package ir.bankid.keycloak.model.req;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenRequest {
    String client_id;
    String username;
    String password;
    String grant_type;
}
