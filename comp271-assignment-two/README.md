# Comp 271 - Assignment Two: Stack and Queue

## Due date: November 10, 2026, 6:00pm

## Note: we will work on this assignment together in class.  Please do not begin the assignment until after we work on this together in class.

### Step One - Switch to your development branch - 5 points

In your local working copy of this repository, make sure that you are on the `development` branch:

```
git checkout development
```


### Step Two - Make the stackFunctionality test pass - 15 points

Open `ListBackedStackTest.java` and run the tests there. 

Your first goal is to make the test called `stackFunctionality()` pass. 
Add code **only** in `ListBackedStack.java` (not `ListBackedStackTest.java`)
to make the `stackFunctionality` test pass.

### Step Three - Make the queueFunctionality test pass - 15 points

Open `ListBackedQueueTest.java` and run the tests there.

Your second goal is to make the test called `queueFunctionality()` pass.
Add code **only** in `ListBackedQueue.java` (not `ListBackedQueueTest.java`)
to make the `queueFunctionality` test pass.

### Step Four - Write the reverseTheAlphabet test - 15 points

Now that you have implemented the basic functionality of both stack and 
queue data structures, write a more robust test for your code.

Add code in the `reverseTheAlphabet()` test in `ListBackedStackTest.java` to 
create a test that uses an instance of your `Comp271Stack` class as a data 
structure to facilitate printing the alphabet in reverse order. 

Follow the instructions in `reverseTheAlphabet()` and only add code in `ListBackedStackTest.java`.

### Step Five - Write the firstComeFirstServed test - 15 points

Add code in the `firstComeFirstServed()` test in `ListBackedQueueTest.java` to
model the first-in, first-out contract of the queue data structure. 

Use whatever Java code you chose, but above all:
* Your test must model putting names into a queue and verifying that they are dequeued in the correct order
* Your test must include at least three assertion statements (eg: `assertThat(...).is(..)`)


### Step Six - Complete the table below (type your answers in the space given below) - 10 points:

**Note:** Enter running time in Big-O notation

| Data Structure Operation                                               | Stack Operation    | Stack Running Time | Queue Operation | Queue Running Time |
|------------------------------------------------------------------------|--------------------|------------------------------|------------------------------|------------------------------|
| Add a value to the structure                                           | *your answer here* | *your answer here*           | *your answer here*           | *your answer here*           |
| Check if the structure has data                                        | *your answer here* | *your answer here*           | *your answer here*           | *your answer here*           |
| Retrieve the next available value in the structure without removing it | *your answer here* | *your answer here*           | *your answer here*           | *your answer here*           |
| Remove and retrieve the next available value in the structure          | *your answer here* | *your answer here*           | *your answer here*           | *your answer here*           |

### Step Seven - Submit your assignment by opening a Pull Request

When finished, submit your work by opening a **Pull Request** in GitHub, then **submit a link to 
that Pull Request to the Assignment Two page in Sakai.**

A Pull Request is a GitHub feature that allows you to submit changes
to the owner of a repository.  The owner of the repository can then provide
comments, questions, and feedback on your submission.

You can read about pull requests here: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests
