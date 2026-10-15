package edu.luc.kmurphy37.comp271.sorting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSorterTest {

    @Test
    public void quickSortTenElements() {

        // given
        int[] unsorted = {4, 8, 1, 5, 9, 0, 3, 7, 6, 2};
        int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        IntegerSorter quickSorter = new QuickSorter();

        // when
        quickSorter.sortAscending(unsorted);

        // then
        assertArrayEquals(sorted, unsorted);
    }
}
