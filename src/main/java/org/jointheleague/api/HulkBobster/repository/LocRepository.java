package org.jointheleague.api.HulkBobster.repository;

import org.jointheleague.api.HulkBobster.repository.dto.LocResponse;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class LocRepository {

    private final WebClient webClient;
    private static final String baseUrl = "https://official-joke-api.appspot.com/jokes/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public LocRepository(WebClient webClientMock) {
        this.webClient = webClientMock;
    }

    public Result[] getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                       // .queryParam("fo", "json")
                      //  .queryParam("at", "results")
                      //  .queryParam("q", query)
                        .path(query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
    }


}
