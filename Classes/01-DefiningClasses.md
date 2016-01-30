# Classes Lab 01: Defining Classes

## Objective

This microlab introduces defining classes. Every java program defines at least one class by default, to house the main method.

### Vocab

- Class declaration: The code which defines a blueprint for how objects of a particular class are constructed. Consists of the `class` keyword and a class name (and optionally other modifiers) followed by a class body.
- Compilation unit 

### Keywords

- `class` - Identifies the start of a class definition. May be preceded or followed by modifiers (including public). Followed by a block in curly brackets (`{ }`) which defines members of the class.
- `public` - When used alongside class, defines the primary class in a compilation unit. Public classes must have their own compilation unit (file).

## Instructions

1. Create a new file called `App.java`.
2. In `App.java` create the usual `App` class with a `public static void main()` method.
3. After the closing bracket of the `App` class, create two new classes with empty bodies. Call them `FirstClass` and `SecondClass`.
4. In the `main` method of `App`, declare and instantiate one object of each of the classes you just declared. (eg: `FirstClass mail = new FirstClass();`).
5. Save your program, then compile and run it. You should expect no output if it runs successfully (You can add a System.out.println() if you want to see output to confirm it ran).
6. Add a third class to your file, and declare and instantiate it the same as the other two.
7. Compile and run your program again to confirm you haven't made any errors.
8. Job well done. Go to your favorite coffee shop and say "Coffee myCoffee = new Coffee();" and see what happens.

## Important points

- Multiple classes can be declared in one file.
- Only one class per compilation unit (file) can be declared `public`.
- Class declarations define blueprints for objects, which can then be used in your programs.