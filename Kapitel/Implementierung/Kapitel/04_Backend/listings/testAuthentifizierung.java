try {
  JWTVerifier verifier = JWT
                    .require(Algorithm.HMAC256
                      (--geheime GitHub-Umgebungsvariable--))
                    .withIssuer("my-graphql-api") 
                    .build();
  return Optional.of(verifier.verify(token));
} catch(JWTVerificationException exx) {
  return Optional.empty();
}