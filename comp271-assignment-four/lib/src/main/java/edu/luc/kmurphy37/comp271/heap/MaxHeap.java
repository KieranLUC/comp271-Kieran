package edu.luc.kmurphy37.comp271.heap;

public class MaxHeap implements HeapAbstractDataType {

    private int capacity;
    private int tailIndex;
    private Integer[] heapArray;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heapArray = new Integer[this.capacity];
        this.tailIndex = 0;
    }

    @Override
    public void insert(Integer value) {
        this.heapArray[this.tailIndex] = value;
        HeapSorter.percolateUp(this.tailIndex, this.heapArray);
        this.tailIndex++;
    }

    @Override
    public Integer remove() {

        Integer max = this.heapArray[0];

        this.tailIndex--;
        this.heapArray[0] = heapArray[this.tailIndex];
        this.heapArray[tailIndex] = null;

        HeapSorter.percolateDown(0, this.heapArray, this.tailIndex);

        return max;
    }

}
