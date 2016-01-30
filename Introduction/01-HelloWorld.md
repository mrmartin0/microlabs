# Introduction Lab 01: Hello World

## Purpose

This microlab demonstrates the simplest possible Java program, 
as well as how to compile and run the program in a terminal.

## Instructions

1. Create a file called `App.java`. 
2. Copy the code for `App.java` into your file and save it.  
3. In a terminal, change to the directory containing `App.java`
4. Compile the program with the command `javac App.java`
5. Run the program with `java App` -> This automatically recognizes the new `App.class` file you created in step 4.
6. Congratulate yourself on running your first java program.

### App.java:

```
public class App {
  public static void main(String[] args){
    System.out.println("Hello World");
  }
}
```

## Important points:

- To run a program, it must have a `main` method.
- The file name must match the name of the public class inside (plus `.java`)
- `System.out.println();` is the standard method of printing text to the terminal in Java.