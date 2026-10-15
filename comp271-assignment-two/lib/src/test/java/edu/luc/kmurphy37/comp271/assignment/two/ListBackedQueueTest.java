package edu.luc.kmurphy37.comp271.assignment.two;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListBackedQueueTest {


    private ByteArrayOutputStream whatWasPrinted;

    @BeforeEach
    public void setUp() {
        // setup - capture System.out so we can test what is printed
        this.whatWasPrinted = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.whatWasPrinted));
    }

    @Test
    public void canaryTest() {
        assertThat(true).isTrue();
    }

    @Test
    public void queueFunctionality() {

        ListBackedQueue<String> queue = new ListBackedQueue<>();
        assertThat(queue.isEmpty()).isTrue();

        queue.enqueue("Hello");

        assertThat(queue.isEmpty()).isFalse();

        assertThat(queue.peek()).isEqualTo("Hello");

        assertThat(queue.dequeue()).isEqualTo("Hello");

        assertThat(queue.isEmpty()).isTrue();
    }

    @Test
    public void firstComeFirstServed() {

        String[] names = { "Sally", "Kwang", "Jing", "Alex", "Howard", "Pauline", "Lily", "Brendan", "Lourdes", "Jose", "William"};

        // TODO Write a test that inserts ten names into a queue and verifies that they are dequeued in the correct order
        throw new RuntimeException("not written yet!!");
    }
}
