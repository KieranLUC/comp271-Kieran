package edu.luc.kmurphy37.comp271.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSorterTest {

    @Test
    public void heapSortsIntegers() {

        // given
        Integer[] integers = {6, 5, 7, 0, 9, 3, 8, 1, 4, 2};

        // when
        HeapSorter.sort(integers, integers.length);

        // then
        Integer[] sortedIntegers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(sortedIntegers, integers);
    }
}
