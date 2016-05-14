# Proposition parser

## Intro.
This is a proposition parser program for discrete math class lab.

## Package Structure
src/  ->  source code  
input.txt  ->  propositions for parsing  
output.txt  ->  parsing result  
README.md  ->  this file  
.gitignore  ->  git ignore file  

## Implementation
Using stack, class Parser read the proposition string from left to right and split it into small propositions recursively.
To represent the proposition, I design the class Proposition and its subclasses such as BinaryProp, UnaryProp, PropositionalLetter.
I also introduce class Connective to deal with the representation of connectives.
I do not implement GUI for this program.
Thus it will only give out whether one string is a well-formed proposition or not by simply output "yes" or "no".

## Build
Import the program to IntelliJ IDEA and run it.
The program with read the proposition from "input.txt" line by line.
So please input the propositions you want to test to this file line by line and the program will print the result to "output.txt".
