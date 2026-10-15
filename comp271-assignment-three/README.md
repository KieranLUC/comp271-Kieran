# Comp 271 - Assignment Three - 75 points

## Due date: November 24, 2026, 6:00pm

### Step One - Switch to your development branch - 5 points

In your local working copy of this repository, make sure that you are on the `development` branch:

```
git checkout development
```


### Step Two - Implement the insert(Integer value) method in the BinarySearchTree class - 15 points

You will know you are done when the following tests in BinarySearchTreeTest pass:

| Tests for Insert | 
| ------ | 
| `insertsToEmptyBinarySearchTree()` | 
| `insertsNewLeafNode()` | 
| `insertsNewInternalNode()` | 

### Step Three - Implement the search(Integer value) method on the BinarySearchTree class - 15 points

Notice that the return type of this method is BinaryTreeNode.  Also notice that this method
returns `null` if the value searched for is not found.

You will know you are done when the following tests in BinarySearchTreeTest pass:

| Tests for Search | 
| ------ | 
| `searchesAndFinds()` | 
| `searchesWithoutFinding()` | 


### Step Four - Implement the remove(Integer value) method on the BinarySearchTree class - 15 points

Note that the return type of this method is `boolean`. It should return `true` if the value
was found and removed from the tree, or `false` if the value was not found.

You will know you are done when the following tests in BinarySearchTreeTest pass:

| Tests for Remove           | 
|----------------------------| 
| `removeRootNode()`       | 
| `removeLeafNode()` | 
| `removeInternalNodeWithSingleChild()` | 
| `removeInternalNodeWithTwoChildren()` | 


### Step Five - Implement the printInOrderRecursiveHelperMethod(BinaryTreeNode binaryTreeNode) method on the BinarySearchTree class - 15 points

Notice that the return type of this method is BinaryTreeNode.

You will know you are done when the following test in BinarySearchTreeTest passes.  Note 
that this test is evaluating what is printed to `System.out`.

| Test for In Order Traversal | 
| ------ | 
| `printsUsingInOrderTraversal()` | 

### Step Six - Complete the table below (type your answers in the space given below) - 10 points:

**Note:** Enter running time in Big-O notation

Method Name	                                                      Running Time
insert(Integer value)	                                            O(h)
search(Integer value)                                            	O(h)
remove(Integer value)	                                            O(h)
printInOrderRecursiveHelperMethod(BinaryTreeNode binaryTreeNode)	O(n)


### Step Seven - Submit your assignment by opening a Pull Request

When finished, submit your work by opening a **Pull Request** in GitHub.

A Pull Request is a GitHub feature that allows you to submit changes
to the owner of a repository.  The owner of the repository can then provide
comments, questions, and feedback on your submission.

You can read about pull requests here: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests
