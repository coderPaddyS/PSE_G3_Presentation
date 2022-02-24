private static void compare(GraphQLTestTemplate graphQLTestTemplate
    , String testname)
 throws IOException, JSONException {
    String expectedResultBody = read(format(GRAPHQL_QUERY_RESPONSE_PATH, testname));
    GraphQLResponse response = graphQLTestTemplate.postForResource(
        format(GRAPHQL_QUERY_REQUEST_PATH, testname));
    String test = response.getRawResponse().getBody();
    assertThat(response.isOk()).isTrue();
    JSONAssert.assertEquals(expectedResultBody, response.getRawResponse().getBody(), true);
}