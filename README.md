# Simple Gradle Project

Gradle is quite a powerful build automation system that can handle many different kinds of languages! Even non JVM ones!

For this specific Gradle project, we are using JUnit 6 as our testing framework! 

If you take a look at the `build.gradle.kts` file...

## Q1: What is the exact version of JUnit being implemented in this project?

[Answer here]

## Task 1:
Take a look at the `Range` class in the *src/main/java* directory and get a feel for what the code should do based 
on the javadocs.

- **Notice that the *java* directory is not the colored blue!**
- What we are being told by this, is that Intellij is letting us know the exact directory it is expected the Java 
  source files to be in. Based on the implemented build system, it could be different!

## Task 2:
Now right-click on the `Range` `class` and then click on *Go To -> Test -> RangeTest* to automatically be taken to 
the `RangeTest` `class` in the *src/test/java* directory. 

- If you were to navigate to this directory in the left navigation pane, you will notice that **all testing code is 
  expected in the directory colored green**.
- Again the location of the testing code could be different based on the implemented build system.

## Task 3:

Run the entire test suite using the Gradle *test* task.
- This can be found by clicking on the elephant on the right toolbar, going to *Tasks -> verification* and then 
  double-clicking *test*.

Tests should fail. :( Can you fix the tests (and possibly the source code) to verify that the `Range` class 
functions properly? 