package edu.luc.kmurphy37.comp271.trees;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeTest {



    @Test
    public void insertsToEmptyBinarySearchTree() {

        // given
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        // when
        binarySearchTree.insert(5);

        // then
        BinaryTreeNode rootNode = binarySearchTree.getRootNode();

        assertThat(rootNode).isNotNull();
        assertThat(rootNode.getValue()).isEqualTo(5);
        assertThat(rootNode.getLeftChild()).isNull();
        assertThat(rootNode.getRightChild()).isNull();
    }

    @Test
    public void insertsNewLeafNode() {

        // given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);

        // when
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);

        // then
        BinaryTreeNode rootNode = binarySearchTree.getRootNode();
        assertEquals(5, rootNode.getValue());
        assertEquals(4, rootNode.getLeftChild().getValue());
        assertEquals(6, rootNode.getRightChild().getValue());
        assertNull(rootNode.getLeftChild().getLeftChild());
        assertNull(rootNode.getRightChild().getRightChild());
    }

    @Test
    public void insertsNewInternalNode() {

        // given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);

        // when
        binarySearchTree.insert(12);

        // then
        BinaryTreeNode rootNode = binarySearchTree.getRootNode();
        assertEquals(10, rootNode.getValue());

        assertEquals(5, rootNode.getLeftChild().getValue());
        assertEquals(15, rootNode.getRightChild().getValue());

        assertNull(rootNode.getLeftChild().getRightChild());
        assertEquals(12, rootNode.getRightChild().getLeftChild().getValue());
    }

    @Test
    public void searchesAndFinds() {

        // given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(34);
        binarySearchTree.insert(12);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(1);
        binarySearchTree.insert(93);

        // then
        assertEquals(Integer.valueOf(10), binarySearchTree.search(10).getValue());
        assertEquals(Integer.valueOf(5), binarySearchTree.search(5).getValue());
        assertEquals(Integer.valueOf(34), binarySearchTree.search(34).getValue());
        assertEquals(Integer.valueOf(12), binarySearchTree.search(12).getValue());
        assertEquals(Integer.valueOf(6), binarySearchTree.search(6).getValue());
        assertEquals(Integer.valueOf(9), binarySearchTree.search(9).getValue());
        assertEquals(Integer.valueOf(1), binarySearchTree.search(1).getValue());
        assertEquals(Integer.valueOf(93), binarySearchTree.search(93).getValue());
    }

    @Test
    public void searchesWithoutFinding() {

        // given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);

        // then
        assertNull(binarySearchTree.search(42));
        assertNull(binarySearchTree.search(8));
        assertNull(binarySearchTree.search(325));
    }

    @Test
    public void removeRootNode() {

        // arrange
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(28);
        binarySearchTree.insert(12);
        binarySearchTree.insert(34);

        // act
        binarySearchTree.remove(28);

        // assert
        BinaryTreeNode rootNode = binarySearchTree.getRootNode();

        assertThat(rootNode.getValue()).isEqualTo(34);
        assertThat(rootNode.getLeftChild().getValue()).isEqualTo(12);
        assertThat(rootNode.getRightChild()).isNull();
    }

    @Test
    public void removeLeafNode() {

        // arrange
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(28);
        binarySearchTree.insert(12);
        binarySearchTree.insert(34);

        // act
        binarySearchTree.remove(34);

        // assert
        BinaryTreeNode rootNode = binarySearchTree.getRootNode();

        assertThat(rootNode.getValue()).isEqualTo(28);
        assertThat(rootNode.getLeftChild().getValue()).isEqualTo(12);
        assertThat(rootNode.getRightChild()).isNull();
    }

    @Test
    public void removeInternalNodeWithSingleChild() {

        /**
         *    This test creates the following tree:
         *
         *          9
         *         / \
         *        8   17
         *       /   / \
         *      3   16  41
         *         /   / \
         *        12  19  63
         *
         *    The test then removes 8. After removing 8 the tree is:
         *
         *          9
         *         / \
         *        3   17    <-- 3 is 8's successor, so it has been moved into 8's position
         *           / \
         *          16  41
         *         /    / \
         *        12  19  63
         *
         */

        // arrange
        int[] values = {9, 17, 8, 3, 41, 16, 12, 19, 63};

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < values.length; i++) {
            binarySearchTree.insert(values[i]);
        }

        // act
        boolean valueWasRemoved = binarySearchTree.remove(8);

        // assert
        assertThat(valueWasRemoved).isTrue();

        BinaryTreeNode rootNode = binarySearchTree.getRootNode();

        assertThat(rootNode.getValue()).isEqualTo(9);
        assertThat(rootNode.getLeftChild().getValue()).isEqualTo(3);
        assertThat(rootNode.getRightChild().getValue()).isEqualTo(17);

        assertThat(rootNode.getLeftChild().getLeftChild()).isNull();
        assertThat(rootNode.getLeftChild().getRightChild()).isNull();
    }

    @Test
    public void removeInternalNodeWithTwoChildren() {

        /**
         *    This test creates the following tree:
         *
         *          9
         *         / \
         *        8   17
         *       /   / \
         *      3   16  41
         *         /   / \
         *        12  19  63
         *
         *    The test then removes 17. After removing 17 the tree is:
         *
         *          9
         *         / \
         *        8   19    <-- 19 is 17's successor, so it has been moved into 17's position
         *       /   / \
         *      3   16  41
         *         /     \
         *        12      63
         *
         */

        // arrange
        int[] values = {9, 17, 8, 3, 41, 16, 12, 19, 63};

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < values.length; i++) {
            binarySearchTree.insert(values[i]);
        }

        // act
        boolean valueWasRemoved = binarySearchTree.remove(17);

        // assert
        assertThat(valueWasRemoved).isTrue();

        BinaryTreeNode rootNode = binarySearchTree.getRootNode();

        assertThat(rootNode.getValue()).isEqualTo(9);
        assertThat(rootNode.getLeftChild().getValue()).isEqualTo(8);
        assertThat(rootNode.getRightChild().getValue()).isEqualTo(19);

        assertThat(rootNode.getRightChild().getLeftChild().getValue()).isEqualTo(16);
        assertThat(rootNode.getRightChild().getRightChild().getValue()).isEqualTo(41);

        assertThat(rootNode.getRightChild().getRightChild().getLeftChild()).isNull();
        assertThat(rootNode.getRightChild().getRightChild().getRightChild().getValue()).isEqualTo(63);

    }

    @Test
    public void printsUsingInOrderTraversal() {

        // setup - capture System.out so we can test what is printed
        ByteArrayOutputStream systemDotOutCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemDotOutCaptor));

        // given a BinarySearchTree with values 0 - 9
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        binarySearchTree.insert(0);
        binarySearchTree.insert(5);
        binarySearchTree.insert(8);

        // when
        binarySearchTree.printInOrder();

        // then
        assertEquals("0123456789", systemDotOutCaptor.toString().trim());
    }
}
