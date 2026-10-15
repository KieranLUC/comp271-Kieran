package edu.luc.kmurphy37.comp271.assignment.two;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ListBackedStackTest {

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
    public void stackFunctionality() {

        // TODO - Make this test pass by adding code in ListBackedStack.java

        ListBackedStack<String> stack = new ListBackedStack<>();

        assertThat(stack.isEmpty()).isTrue();

        stack.push("Hello");

        assertThat(stack.isEmpty()).isFalse();

        assertThat(stack.peek()).isEqualTo("Hello");

        assertThat(stack.pop()).isEqualTo("Hello");

        assertThat(stack.isEmpty()).isTrue();

    }

    @Test
    public void reverseTheAlphabet() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetReversed = "zyxwvutsrqponmlkjihgfedcba";

        // TODO - add code to this test to make the assertion pass
        /**
         * Write code here in the test that uses an instance of
         * your Comp271Stack class to facilitate printing the
         * alphabet in reverse order.
         *
         * Your code can print using System.out.print(...) and the output
         * will be captured in the whatWasPrinted instance variable.
         *
         * Your code should make the assertion pass.
         */

        System.out.print("Write code here to make the assertion pass");
        assertThat(whatWasPrinted).isEqualTo(alphabetReversed);
    }
}
