
package org.jointheleague.api.HulkBobster.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LocResponse {

    private List<Result> results = null;
    @JsonProperty("recipes")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("recipes")
    public void setRecipes(List<Result> results) {
        this.results = results;
    }

}