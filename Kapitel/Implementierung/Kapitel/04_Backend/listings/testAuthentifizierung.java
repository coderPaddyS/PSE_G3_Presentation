try {
    JWTVerifier verifier = JWT
                      .require(Algorithm.HMAC256("secret"))
                      .withIssuer("my-graphql-api") //TODO
                      .build();
    return Optional.of(verifier.verify(token));
} catch(JWTVerificationException exx) {
    return Optional.empty();
}