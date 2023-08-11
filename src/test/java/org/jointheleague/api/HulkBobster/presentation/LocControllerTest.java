package org.jointheleague.api.HulkBobster.presentation;

import org.jointheleague.Recipes.UsedIngredient;
import org.jointheleague.api.HulkBobster.repository.dto.Recipe;
import org.jointheleague.api.HulkBobster.repository.dto.UsedIngredient;
import org.jointheleague.api.HulkBobster.service.LocService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;
import org.jointheleague.api.HulkBobster.presentation.LocController;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
/*
class LocControllerTest {
    private LocController locController;

    @Mock
    private LocService locService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        locController = new LocController(locService);
    }
    @Test
    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
        //given
        String query = "Java";
        Recipe result = new Recipe();
        result.setTitle("TITLE");
        result.setId(0);
        result.setImage("IMAGE");
        result.setImageType("IMAGE-TYPE");
        result.setLikes(0);
        result.setUsedIngredientCount(0);
        result.setUsedIngredients(new UsedIngredient() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<UsedIngredient> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(UsedIngredient usedIngredient) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends UsedIngredient> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends UsedIngredient> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public UsedIngredient get(int index) {
                return null;
            }

            @Override
            public UsedIngredient set(int index, UsedIngredient element) {
                return null;
            }

            @Override
            public void add(int index, UsedIngredient element) {

            }

            @Override
            public UsedIngredient remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<UsedIngredient> listIterator() {
                return null;
            }

            @Override
            public ListIterator<UsedIngredient> listIterator(int index) {
                return null;
            }

            @Override
            public List<UsedIngredient> subList(int fromIndex, int toIndex) {
                return null;
            }
        });

        Recipe[] expectedResults = {result};
        when(locService.getResults(query))
                .thenReturn(expectedResults);

        //when
        Recipe[] actualResults = locController.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }

    @Test
    void givenBadQuery_whenGetResults_thenThrowsException() {
        //given
        String query = "Java";

        //when
        //then
        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> locController.getResults(query));
        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
    }
}

 */

