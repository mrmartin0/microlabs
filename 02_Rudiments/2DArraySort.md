# 2D Array Sorting Microlab

## Instructions


Write a method that takes a two dimensional array of integers as an argument. Sort the array according to these rules:

1. Each nested array should be sorted in descending order
2. The array of arrays should be sorted in ascending order according to the number of prime numbers in each nested array
3. Ties should be broken based on the position and value of the first odd number, ascending.
4. Two arrays tied based on all of the criteria above should be sorted according to the value of the first element that differs.


Sorted Example:

```Java
[
	[6,4,2,1,0],
	[5,4,3,2,1],
	[17,14,9,7,7],
	[14,9,7,7,5],
	[3,3,2,2]
]
```