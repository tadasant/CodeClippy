package com.solutionloft.codeclippy.model.search.model;

import java.util.List;

public class SearchResponse {
    private Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Post> getResults() {
        return results;
    }

    public void setResults(List<Post> results) {
        this.results = results;
    }

    private List<Post> results;
}
