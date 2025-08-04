/*
4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
*/

import java.util.*;

public class Problem4 {
	public static void main(String[] args) {
		TreeSet<String> colours = new TreeSet<>();
		colours.add("Red");
		colours.add("Rose");
		colours.add("Violet");
		colours.add("Pink");
		colours.add("Black");
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Green");

		System.out.println("TreeSet: " + colours);

		System.out.println("Iterate:");
		for (String colour : colours) System.out.print(colour + " ");

		TreeSet<String> coloursCopy = new TreeSet<>(colours);

		System.out.println("\nReverse order: " + colours.descendingSet());

		// e. First and Last
		System.out.println("First: " + colours.first());
		System.out.println("Last : " + colours.last());

		// f. Clone
		TreeSet<String> coloursClone = (TreeSet<String>) colours.clone();

		// g. Size
		System.out.println("Size: " + colours.size());

		// h. Compare
		System.out.println("Are colours and coloursCopy same? " + colours.equals(coloursCopy));

		// Create number TreeSet
		TreeSet<Integer> numberList = new TreeSet<>();
		
		numberList.add(10);
		numberList.add(6);
		numberList.add(2);
		numberList.add(190);
		numberList.add(104);
		numberList.add(67);
		numberList.add(44);
		numberList.add(345);
		numberList.add(3);
		numberList.add(50);

		// i. Less than 7
		System.out.println("Less than 7: " + numberList.headSet(7));

		// j. ≥ number
		System.out.println("Ceiling (≥100): " + numberList.ceiling(100));

		// k. ≤ number
		System.out.println("Floor (≤100): " + numberList.floor(100));

		// l. > number
		System.out.println("Higher (>100): " + numberList.higher(100));

		// m. < number
		System.out.println("Lower (<100): " + numberList.lower(100));

		// n. Remove first
		System.out.println("First removed: " + numberList.pollFirst());

		// o. Remove last
		System.out.println("Last removed: " + numberList.pollLast());

		// p. Remove element
		System.out.println("Removed 90? " + numberList.remove(90));
	}
}
