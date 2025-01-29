# Example Spring Security Config


## features

### example oauth2 resource server

Uses spring oauth2 resource-server dependecy to check if a jwt token is signed by a trusted authority. If so, user is logged in (authenticated). Public Key and used token is from [blog](https://thomasandolf.medium.com/spring-security-jwts-getting-started-ebdb4e4f1dd1).

### example security filter

allows traffic to:

- actuators
- h2 console
- swagger-ui

## sources

Example for oauth2 resource server config:

- https://thomasandolf.medium.com/spring-security-jwts-getting-started-ebdb4e4f1dd1
- https://github.com/Toerktumlare/spring-security-jwt-demo#scope-based-jwts

Other blogs often propose to build custom logic to access and validate jwts. Be careful, if you do so, you might need to take care of more things then you realsise.


## notes

- WebSecurityConfigurerAdapter is deprecated since Spring Security 5.7.0-M2. Examples how to transition from it are [here](https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter).
- AbstractAuthenticationProcessingFilter (for custom authentication scheme) subclasses:
    - OAuth2ClientAuthenticationProcessingFilter (Spring OAuth2)
    - ClientCredentialsTokenEndpointFilter (Spring OAuth2)
    - UsernamePasswordAuthenticationFilter (Web login authentication)
