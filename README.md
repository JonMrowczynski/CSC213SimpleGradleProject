# Simple Gradle Project

[Gradle](https://gradle.org/) is quite a powerful build automation system that can handle many 
[different languages](https://docs.gradle.org/current/userguide/userguide.html)! Build systems in general help us  
manage larger projects that have 1 or more internal or external (or 3rd party) dependencies.  

For this specific Gradle project, we are using [JUnit 6](https://junit.org/) as our testing framework, so we must 
declare this as one of our dependencies! Take a look at the `build.gradle.kts` to see how this is done.

### Q1: From the `build.gradle.kts` file, what is the exact version of JUnit 6 being implemented in this project?

[Answer here]

### Task 1:
1. Take a look at the `Range` class in the *src/main/java* directory and get a feel for what the code should do based 
on the javadocs. 
   - **Notice that the *java* directory is colored blue!**
   - Intellij is letting us know the exact directory Java source files are expected in by coloring that directory blue. 
     Based on the implemented build system, it could be different!

### Task 2:
1. Right-click on the `Range` `class`, click on *Go To -> Test -> RangeTest* to automatically be taken to 
the `RangeTest` `class` in the *src/test/java* directory.
   - If you were to manually navigate to this directory in the left navigation pane, you will notice that **all testing 
     code is expected in the directory colored green**.
   - The testing code location could be different based on the implemented build system! It is also configurable, 
     but we will always use their default locations, which is good practice.
2. Notice we have multiple **inner classes** inside `RangeTest`. These are called **nested classes**. They have many 
   uses, but here we are using them to help us organize our testing code!

### Q2: How are the nested classes organized? Rather, what exactly does each nested `class` test?   

**Hint:** It might help to look at their javadocs and what tests are contained in each nested `class`.

[Anwer here]

### Task 3 (5pts.):

1. Run the entire test suite using the Gradle *test* task.
   - This can be found by clicking on the elephant on the right toolbar, going to *Tasks -> verification* and then 
     double-clicking *test*.

2. Tests should fail. :,( Can you fix the tests (and possibly the source code) to verify that the `Range` `class` 
functions properly?
    - Note that you can run **individual tests** by clicking on the run button on the same line as the test. This is 
      often desirable to do since running an entire test suite on a code base could take minutes or hours!