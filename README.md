# Sytax Error Safari!!!

When you first start programming, one of the things you struggle with the most is all the dang syntax errors you make. I mean - who knew that spelling actually mattered?!?

This syntax-error pain will soon go away as you become more comfortable with the language. (Of course, this pain will be immediately replaced with the even _greater_ pain of logic errors. Wheeee!)

## Files Involved

There are two files you will need to work on. They are both already created for you:

- `src/main/java/drill/DrillUtil.java`
  - you will be _correcting errors_ in this file
- `src/main/java/drill/Main.java`
  - you will be _adding code_ to this file

## Instructions

1. There are a goodly number of syntax errors in the `DrillUtil.java` source file. Fix them.
   - once you fix all the errors, the tests in `src/test/java/drill/DrillUtilTest.java` will run green. Until this happens, do not move on to the next step!
1. In the `main` method of the `Main.java` class, call the methods from DrillUtil so that when `main` is run, the following is output _exactly_ to the console:
   <!-- prettier-ignore -->
    ```
   Where would you like to go today?

   Top grossing movie of 1988: Rain Man


    Q. What did the mermaid wash her fins with?
      A. Tide.
    ```

    > **NOTES**
    >
    > - the only code you need in main are 5 calls to the methods in DrillUtil
    > - the test in `src/test/java/drill/MainTest.java` will pass if you have done this step correctly
