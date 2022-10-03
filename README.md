# Welcome to Daehee's Mastermind
#### By Daehee Hwang

![Screen Shot 2022-10-03 at 9 37 25 AM](https://user-images.githubusercontent.com/102007615/193631548-adb654f5-62fb-4b4c-bf6c-2f476ffec1b4.png)

----------------------
## Task

Create a Java version of the classic boardgame Mastermind (https://en.wikipedia.org/wiki/Mastermind_(board_game)) that runs with command line prompts.
My focus was to replicate the game using vanilla functions and libraries of Java while implementing all of the essential OOP principles.


## Description
###### The breakdown of the implementation of individual OOP principles is marked with a comment above the said code.
<br/><br/>
It first utilizes `packages` to implement `helper methods` to assist with `encapulation, access control, and containerization (for faster debugging)`

The main driver program my_mastermind.java calls on the packages methods in "need to know" basis.
- Solver.java is the main algorhythm code that utilizes `scoping` to correctly manage the `life cycle` of the variables and methods.
- - User Interface is prettified with Board.java which saves the history of the moves and prints the history and the current moves as a board represented as a matrix ( array of array)
- CLIHelper.java cleans up the interface by providing simple methods that executes user prompts.
- Also utlizes command line input handling, error handling, and various built-in methods to drive the game.

## Installation

File should already be compiled. if you get an error run the following in order.
1. Compile the package.
    * cd in to /mypack from project directory.
    * run "javac -d . Solver.java CLIhelper.java Settings.java"
    * cd .. to go back to project directory.
2. Compile the main program.
    * run "javac Board.java Game.java my_mastermind.java"
    * 
#### else
     run "java my_mastermind.java" 
The console outputs will explain the gameplay process.

## Usage
Copyright © 2022 Daehee Hwang

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
```

### The Core Team
Daehee Hwang a project made as part of Qwasar.io's Bootcamp.

<span><i>Made at <a href='https://qwasar.io'>Qwasar Silicon Valley</a></i></span>
<span><img alt='Qwasar Silicon Valley Logo' src='https://storage.googleapis.com/qwasar-public/qwasar-logo_50x50.png' width='20px'></span>
