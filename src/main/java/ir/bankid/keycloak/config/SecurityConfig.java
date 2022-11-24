package ir.bankid.keycloak.config;

import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@EnableAutoConfiguration
@KeycloakConfiguration
class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(
      AuthenticationManagerBuilder auth) throws Exception {

        KeycloakAuthenticationProvider keycloakAuthenticationProvider
          = keycloakAuthenticationProvider();
        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(
          new SimpleAuthorityMapper());
        auth.authenticationProvider(keycloakAuthenticationProvider);
    }

    @Bean
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(
          new SessionRegistryImpl());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);

        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement()
                .and()
                .authorizeRequests()
                .antMatchers("/token").permitAll()
                .antMatchers("/cellCheck").permitAll()
                .antMatchers("/otp/**").permitAll()
                .antMatchers("/idCheck").permitAll()
                .antMatchers("/getIdentityInfo").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/upload/**").permitAll()
                .antMatchers("/nonEncryptUpload").permitAll()
                .antMatchers("/livenessCheck").permitAll()
                .antMatchers("/facenet").permitAll()
                .antMatchers("/panel/**").permitAll()
//                .antMatchers("/cellCheck").hasAnyRole("user")
//                .antMatchers("/otp/req").hasAnyRole("user")
//                .antMatchers("/otp/check").hasAnyRole("user")
//                .antMatchers("/idCheck").hasAnyRole("user")
//                .antMatchers("/getIdentityInfo").hasAnyRole("user")
//                .antMatchers("/register").hasAnyRole("user")
//                .antMatchers("/upload/**").hasAnyRole("user")
//                .antMatchers("/livenessCheck").hasAnyRole("user")
//                .antMatchers("/facenet").hasAnyRole("user")
//                .antMatchers("/panel/**").hasAnyRole("user")
                /*.antMatchers("/chakavak/standard/idCheck").hasAnyRole("user")
                .antMatchers("/chakavak/standard/otp").hasAnyRole("user")
                .antMatchers("/chakavak/standard/register").hasAnyRole("user")
                .antMatchers("/chakavak/standard/upload").hasAnyRole("user")
                .antMatchers("/chakavak/standard/check").hasAnyRole("user")
                .antMatchers("/chakavak/standard/identity").hasAnyRole("user")*/
                .anyRequest().denyAll();
    }
}