# Nested Classes Lab 01: Defining Inner Classes

## Objective

This microlab introduces defining nested classes. This lab focuses specifically on non-static nested classes, also known as inner classes.

## Instructions

- Create an `App.java` file with corresponding `App` class.
- Inside of the `App` class, define another class called `Inner`.
- Create a `App.getInner()` method that returns a new `Inner` instance
- In `App.main()` declare a reference of type `Inner` and assign it the value returned from `getInner()`.
- In `App.main()` create an instance of Inner without using `getInner()`. (Notice you have to create an instance of `App` first and call the `new` property on that instance).
- Add a field (any primitive type) to `Inner` and try accessing and changing it on both instances in `main()`.
- Change `Inner` to a static class and see what error you get. Static inner classes are not qualified with an instance of the inner class; try to fix the error.