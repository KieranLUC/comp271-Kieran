package edu.luc.kmurphy37.comp271.assignment.two;

import java.util.List;

/**
 * A class implementing the Stack
 * interface, using a List to store data.
 *
 * @param <T> the datatype of the values to be stored
 */
public class ListBackedStack<T>  {

    private List<T> dataStore;

    /**
     * Test if this instance of ListBackedStack is empty
     *
     * @return true if this ListBackedStack is empty, false if it holds data
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Push a new value to this ListBackedStack and return it
     *
     * @param value
     * @return value
     */
    public T push (T value) {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Get the next value from this ListBackedStack without removing it
     *
     * @return the next value from this ListBackedStack
     */
    public T peek() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }

    /**
     * Get the next value from this ListBackedStack
     *
     * @return the next value from this ListBackedStack
     */
    public T pop() {
        throw new UnsupportedOperationException("not implemented yet!!");
    }
}
