package com.solutionloft.codeclippy.model.search;

import com.solutionloft.codeclippy.model.search.model.SearchResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

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
        Response response = this.target.request().get();
        // TODO [TA]: retry logic
        return response.readEntity(SearchResponse.class);
    }
}
