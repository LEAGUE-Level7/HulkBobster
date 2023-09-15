package org.jointheleague.api.HulkBobster.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.jointheleague.api.HulkBobster.repository.dto.LocResponse;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.jointheleague.api.HulkBobster.service.LocService;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000", methods = RequestMethod.GET)
@RestController
public class LocController {

    private final LocService locService;

    public LocController(LocService locService) {
        this.locService = locService;
    }
    @GetMapping("/searchLocResults")
    @Operation(summary = "Searches for recipes matching the search term",
            description = "Response may include multiple Recipe values.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Result(s) found",
            content = {@Content (mediaType = "application/json",
            schema = @Schema(implementation = Result.class))}),
            @ApiResponse(responseCode = "404", description = "Result(s) not found")

    })
    public List<Result> getResults(@RequestParam(value="q") String query){
        List<Result> results = locService.getResults(query);
        if(results == null || results.size() == 0 ){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        return results;
    }

}

