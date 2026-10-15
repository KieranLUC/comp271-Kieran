package edu.luc.kmurphy37.comp271.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSorterTest {

    @Test
    public void selectionSortTenElements() {

        // given
        int[] unsorted = {4, 8, 1, 5, 9, 0, 3, 7, 6, 2};
        int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        IntegerSorter selectionSorter = new SelectionSorter();

        // when
        selectionSorter.sortAscending(unsorted);

        // then
        assertArrayEquals(sorted, unsorted);
    }
}
