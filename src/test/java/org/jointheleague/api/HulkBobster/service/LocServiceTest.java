package org.jointheleague.api.HulkBobster.service;

import org.jointheleague.api.HulkBobster.repository.LocRepository;
import org.jointheleague.api.HulkBobster.repository.dto.LocResponse;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.jointheleague.api.HulkBobster.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LocServiceTest {

    private LocService locService;

    @Mock
    private LocRepository locRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        locService = new LocService(locRepository);
    }

    @Test
    void whenGetResults_thenReturnLocResult() {
        /*String query = "Java";
        Recipe result = new Recipe();
        result.setTitle("TITLE");
        result.setId(0);
        result.setImage("IMAGE");
        result.setImageType("IMAGE-TYPE");
        result.setLikes(0);
        result.setUsedIngredientCount(0);
       List<Recipe> expect = Collections.singletonList(result);
       Result[] expectedResults = new Result[expect.size()];
       for (int i = 0; i < expect.size(); i++) {
           expectedResults[i] = expect.get(i);
       }

        when(locRepository.getResults(query))
                .thenReturn(expectedResults);

        //when
        Result[] actualResults = locService.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);

*/
}}