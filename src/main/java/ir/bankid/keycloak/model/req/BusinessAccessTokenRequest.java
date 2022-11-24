package ir.bankid.keycloak.model.req;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BusinessAccessTokenRequest {
    String client_id;
    String username;
    String password;
}
