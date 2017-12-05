package com.solutionloft.codeclippy.model.search;

import com.solutionloft.codeclippy.model.search.model.SearchResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class JerseyRequestSearch implements RequestSearch {

    private static final String API_HOST = "https://www.solutionloft.com";
    private static final String SEARCH_ROUTE = "/api/search/";
    private final WebTarget target;

    public JerseyRequestSearch() {
        Client client = ClientBuilder.newClient();
        this.target = client.target(String.format("%s%s", API_HOST, SEARCH_ROUTE));
    }

    @Override
    public SearchResponse requestAnswers(String query) {
        SearchResponse searchResponse = this.target.queryParam("query", "java hello world").request(MediaType.APPLICATION_JSON).get(SearchResponse.class);
        // TODO [TA]: retry logic
        return new SearchResponse();
    }

    public static void main(String[] args) {
        RequestSearch jerseyRequestSearch = new JerseyRequestSearch();
        SearchResponse java_hello_world = jerseyRequestSearch.requestAnswers("java hello world");
        System.out.println(java_hello_world.toString());
    }
}
