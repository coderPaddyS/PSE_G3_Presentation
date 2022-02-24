private Optional<DecodedJWT> verifyAndDecodeToken(String token) {
  try {
    DecodedJWT decodedJWT = JWT.decode(token);
    JwkProvider provider = new UrlJwkProvider(new URL(
      "https://oidc.scc.kit.edu/auth/realms/kit/protocol/openid-connect/certs"));
    Jwk jwk = provider.get(decodedJWT.getKeyId());
    JWTVerifier verifier = JWT
      .require(Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null))
      .build();
    return Optional.of(verifier.verify(token));
  } catch(JWTVerificationException | MalformedURLException | JwkException ex) 