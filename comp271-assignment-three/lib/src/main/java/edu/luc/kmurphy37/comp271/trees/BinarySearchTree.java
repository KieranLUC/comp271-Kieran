package edu.luc.kmurphy37.comp271.trees;

public class BinarySearchTree {

    private BinaryTreeNode rootNode;

    /**
     * Insert an Integer value into the BinarySearchTree
     *
     * @param value - the Integer value to insert
     */
    public void insert(Integer value) {
        throw new UnsupportedOperationException("TODO - implement this method!!");
    }

    /**
     * Accessor for getting the root node of the BinarySearchTree
     *
     * @return the root node, or null if the tree is empty
     */
    public BinaryTreeNode getRootNode() {
        return this.rootNode;
    }

    /**
     * Search the BinarySearchTree for the node storing the requested value.
     *
     * @param value - the Integer value to search for
     * @return the BinaryTreeNode which stores that value,
     *          or null if the value is not stored in the BinarySearchTree
     */
    public BinaryTreeNode search(Integer value) {
        throw new UnsupportedOperationException("TODO - implement this method!!");
    }

    /**
     * Remove the node storing a particular value from the BinarySearchTree
     *
     * @param value - the Integer value to be removed
     * @return true if the value was present and was removed, false if the value was not present
     */
    public boolean remove(Integer value) {
        throw new UnsupportedOperationException("TODO - implement this method!!");
    }

    /**
     * Print the values stored in the BinarySearchTree in order
     * from least to greatest, on a single line, with no spaces
     * in between.
     *
     * This method prints to System.out.
     */
    public void printInOrder() {
        printInOrderRecursiveHelperMethod(this.getRootNode());
    }

    /**
     * Private, recursive helper method to perform an inorder traversal of
     * the BinarySearchTree.
     *
     * @param binaryTreeNode
     */
    private void printInOrderRecursiveHelperMethod(BinaryTreeNode binaryTreeNode) {
        System.out.print("TODO - print the elements of the binary search tree using an inorder traversal");
    }
}
