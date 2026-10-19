Debugger CheatSheet
==============

## Debugging steps

1. Identify what you want to inspect and why (variable values? control flow?)
2. Set breakpoints on lines you want the program to stop at
3. Run the program in debug mode via a test or via main
4. Step over/into/out or skip breakpoints as needed to find your answers

## Basic Breakpoint operations

Operation        | How to do it
-----------------|-------------------
Set a breakpoint | Click left of the line number you want to set breakpoint
Clear breakpoint | Click on red dot left of line number of breakpoint to remove

## Running the Debugger
=============

Operation        | How to do it
-----------------|-------------------
Debug via test   | Go to test, right-click on Play Arrow and select Debug
Debug via main method | Run -> Start Debugging (or click F5)

## Navigating during Debugging
=============

Operation        | How to do it
-----------------|-------------------
Step Over to go to next line | Click the arrow that jumps over dot
Step Into to inspect method  | Click the arrow that points down to dot
Step Out to inspect what called this method | Click the arrow that points up from dot
Keep going until next breakpoint | Click the Resume Play button (triangle with vertical line) or press F5
Reset the entire program | Click the circular arrow
Stop the program | Click the stop button (or press Shift+F5)

## The Inspection Windows

Window name       | What it displays
-----------------|-------------------
Variables | Shows values of variables currently in scope (read: the program can see at a given point in time)
Watch | Allows user to write Java expressions which are calculated using data from Variables window
Call Stack | Shows what methods were called to get to the current line. Topmost is always the current method.
Breakpoints | What breakpoints are currently being used. Use to control when a set breakpoint should be ignored.

Challenge
===========

There is a controller in the file `NonNegativeCalcController.java` that
loops forever under a certain condition. This is a _classic_ bug when writing controllers that ignore certain inputs. We confirmed this bug exists with
the test `testControllerCanQuitMidAdd` in `NonNegativeCalcControllerTests.java`.

> **Heads up:** because of this bug, that test never finishes, so `./gradlew test` (or running that test in VS Code) runs forever. That's the bug, not your setup. Stop it with **Ctrl+C** in the terminal, or the red **Stop** button in VS Code. The other test, `testControllerIgnoresNegativeNumbersDuringAdd`, passes.

**Your task**: Investigate and explain _why_ the program loops forever in this case and use the debugger to back up your reasoning. Use that exploration to write a test with more precise input that fails because of this bug. In other words, if there was a bug with reading _positive_ numbers, this new test would still pass.
