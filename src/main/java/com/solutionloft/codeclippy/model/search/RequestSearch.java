package com.solutionloft.codeclippy.model.search;

import com.solutionloft.codeclippy.model.search.model.SearchResponse;

public interface RequestSearch {
    SearchResponse requestAnswers(String query);
}
