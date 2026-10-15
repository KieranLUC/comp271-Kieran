# Comp 271 - Assignment Four: Heap and Heap Sort

## Due date: December 1, 2026, 6:00pm

### Step One - Switch to your development branch - 5 points

In your local working copy of this repository, make sure that you are on the `development` branch:

```
git checkout development
```


### Step Two - Make the test in MaxHeapTest pass  by implementing the percolateUp(..) and percolateDown(..) methods in HeapSorter.java - 30 points

Run the test in `MaxHeapTest.java`.  You will see that it fails on `UnsupportedOperationException`
from these two methods in `HeapSorter.java`.

Make this test pass by implementing `HeapSorter.percolateUp(..)` and `HeapSorter.percolateDown(..)`.
Use the algorithms described in zyBook chapter 6.

**DO NOT MODIFY `MaxHeapTest.java` or `MaxHeap.java`!!**  You must **ONLY** make changes to `HeapSorter.java`,
not to the test.  Making the test in `MaxHeapTest.java` pass is your goal!

### Step Three - Make the test in `HeapSorterTest.java` pass by implementing the sort(Integer[] numbers, int sizeOfNumbers) method the HeapSorter class - 30 points

Run the test in `HeapSorterTest.java`.  You will see that it fails on `UnsupportedOperationException`
from the `sort(..)` method in `HeapSorter.java`.

Make this test pass by implementing the `sort(..)` method. *Your implementation of sort(..) must call
the `percolateDown(..)` method that you implemented in Step Two*.

**DO NOT MODIFY `HeapSorterTest.java`!!**  You must **ONLY** make changes to `HeapSorter.java`,
not to the test.  Making the test in `HeapSorterTest.java` pass is your goal!

### Step Four - Answer the question below (type your answers in the space given below) - 10 points:

**Note:** When discussing running time, we use the Big-O notation

* Why is the running time of `insert(..)` O(log n)?

* What is the running time of `sort(..)`?

* Why is that the running time of `sort(..)`?

### Step Five - Submit your assignment by opening a Pull Request and putting a link to your pull request into Sakai

Deliverables:
1.  A Pull Request submitted via GitHub
2.  The URL of that Pull Request submitted in Sakai

When finished, submit your work by opening a **Pull Request** in GitHub, then **submit a link to
that Pull Request to the Assignment Two page in Sakai.**

A Pull Request is a GitHub feature that allows you to submit changes
to the owner of a repository.  The owner of the repository can then provide
comments, questions, and feedback on your submission.

You can read about pull requests here: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests
