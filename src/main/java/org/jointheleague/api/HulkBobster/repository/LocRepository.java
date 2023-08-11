package org.jointheleague.api.HulkBobster.repository;

import org.jointheleague.api.HulkBobster.repository.dto.LocResponse;
import org.jointheleague.api.HulkBobster.repository.dto.Recipe;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {

    private final WebClient webClient;
    private static final String baseUrl = "https://api.spoonacular.com/recipes/findByIngredients";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public LocRepository(WebClient webClientMock) {
        this.webClient = webClientMock;
    }

    public Recipe[] getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
                        .queryParam("apiKey", "c1c3780428f0477890d87422fd0f0390")
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getRecipes();
    }


}
