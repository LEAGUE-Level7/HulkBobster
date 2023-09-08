
package org.jointheleague.api.HulkBobster.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocResponse {

    private Result[] results = null;
//SWITCH EVERYTHING TO ARRAYLISTS WELL JUST LISTS BUT DO IT
    @JsonProperty("recipes")
    public Result[] getResults() {
        return results;
    }

    @JsonProperty("recipes")
    public void setRecipes(Result[] results) {
        this.results = results;
    }

}