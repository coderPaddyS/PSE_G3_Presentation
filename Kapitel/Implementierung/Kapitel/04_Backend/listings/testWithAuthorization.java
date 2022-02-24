public static void validate(GraphQLTestTemplate graphQLTestTemplate,
 String testname, String user) throws IOException, JSONException {
  String token = JWT
          .create()
          .withIssuer("my-graphql-api")
          .withIssuedAt(Calendar.getInstance().getTime())
          .withExpiresAt(new Date(Calendar.getInstance().
                getTime().getTime() + 600))
          .withClaim("preferred_username", user)
          .sign(Algorithm.HMAC256("secret"));
  graphQLTestTemplate.withBearerAuth(token);
  compare(graphQLTestTemplate, testname);
}