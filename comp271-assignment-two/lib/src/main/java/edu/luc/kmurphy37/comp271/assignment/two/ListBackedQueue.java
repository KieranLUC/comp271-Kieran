package edu.luc.kmurphy37.comp271.assignment.two;

import java.util.List;

/**
 * A class implementing the Queue interface, using an instance
 * of java.util.List to store data.
 *
 * @param <T> the datatype of the values to be stored
 */
public class ListBackedQueue<T> {

    private List<T> dataStore;

    /**
     * Enqueue a new value and return it
     *
     * @param value
     * @return value
     */
    public T enqueue(T value) {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Test if this instance of ListBackedQueue is empty
     *
     * @return true if this ListBackedQueue is empty, false if it holds data
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Get the next value from this ListBackedQueue without removing it
     *
     * @return the next value in this ListBackedQueue
     */
    public T peek() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Remove and return the next value from this ListBackedQueue
     *
     * @return the next value in this ListBackedQueue
     */
    public T dequeue() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }
}
