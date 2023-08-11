
package org.jointheleague.api.HulkBobster.repository.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.transform.Result;

public class LocResponse {

    private Recipe[] recipes = null;

    @JsonProperty("recipes")
    public Recipe[] getRecipes() {
        return recipes;
    }

    @JsonProperty("recipes")
    public void setRecipes(Recipe[] recipes) {
        this.recipes = recipes;
    }

}