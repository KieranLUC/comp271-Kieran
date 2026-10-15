package edu.luc.kmurphy37.comp271.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxHeapTest {

    @Test
    public void removesMax() {

        // given
        HeapAbstractDataType maxHeap = new MaxHeap(30);

        // when
        maxHeap.insert(4);
        maxHeap.insert(1);
        maxHeap.insert(9);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(8);
        maxHeap.insert(3);
        maxHeap.insert(6);
        maxHeap.insert(2);
        maxHeap.insert(7);

        maxHeap.insert(18);
        maxHeap.insert(14);
        maxHeap.insert(15);
        maxHeap.insert(17);
        maxHeap.insert(20);
        maxHeap.insert(11);
        maxHeap.insert(19);
        maxHeap.insert(13);
        maxHeap.insert(16);
        maxHeap.insert(12);

        maxHeap.insert(26);
        maxHeap.insert(21);
        maxHeap.insert(29);
        maxHeap.insert(24);
        maxHeap.insert(25);
        maxHeap.insert(22);
        maxHeap.insert(30);
        maxHeap.insert(28);
        maxHeap.insert(23);
        maxHeap.insert(27);

        // then
        assertEquals(30, maxHeap.remove());
        assertEquals(29, maxHeap.remove());
        assertEquals(28, maxHeap.remove());
        assertEquals(27, maxHeap.remove());
        assertEquals(26, maxHeap.remove());
        assertEquals(25, maxHeap.remove());
        assertEquals(24, maxHeap.remove());
        assertEquals(23, maxHeap.remove());
        assertEquals(22, maxHeap.remove());
        assertEquals(21, maxHeap.remove());

        assertEquals(20, maxHeap.remove());
        assertEquals(19, maxHeap.remove());
        assertEquals(18, maxHeap.remove());
        assertEquals(17, maxHeap.remove());
        assertEquals(16, maxHeap.remove());
        assertEquals(15, maxHeap.remove());
        assertEquals(14, maxHeap.remove());
        assertEquals(13, maxHeap.remove());
        assertEquals(12, maxHeap.remove());
        assertEquals(11, maxHeap.remove());

        assertEquals(10, maxHeap.remove());
        assertEquals(9, maxHeap.remove());
        assertEquals(8, maxHeap.remove());
        assertEquals(7, maxHeap.remove());
        assertEquals(6, maxHeap.remove());
        assertEquals(5, maxHeap.remove());
        assertEquals(4, maxHeap.remove());
        assertEquals(3, maxHeap.remove());
        assertEquals(2, maxHeap.remove());
        assertEquals(1, maxHeap.remove());
    }
}
