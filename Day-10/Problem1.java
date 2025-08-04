/*
1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
*/

import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
	
		// a.creating array list
		List<String> colourList = new ArrayList<>(); // Data type : String
		
		// inserting elements
		colourList.add("Violet");
		colourList.add("Indigo");
		colourList.add("Blue");
		colourList.add("Green");
		colourList.add("Yellow");
		colourList.add("Red");
		colourList.add("Rose");
		
		// printing the collection
		System.out.println("Printing List");
		System.out.println(colourList);
		
		// iterating and Printing list
		System.out.println("\nPrinting list iteratively");
		for(String colour : colourList) {
			System.out.println(colour + "\t");
		}
		
		// adding element in first position
		colourList.add(0,"Black");
		
		System.out.println("\nList after element is added to first position");
		System.out.println(colourList);
		
		// Retrive element from particular index
		System.out.println("\nColour present in 4th Position is " + colourList.get(3));
		
		// to update specific array element by given element.
		colourList.set(colourList.indexOf("Rose"), "Pink");
		
		System.out.println("\nArray list after updating data in old list");
		System.out.println(colourList);
		
		// to remove the third element from an array list.
		colourList.remove(2);
		System.out.println("\nList after removing 3rd element");
		System.out.println(colourList);
		
		// g. to search an element in an array list.
		if(colourList.indexOf("Violet")!=-1)
			System.out.println("Element present at index " + colourList.indexOf("Violet"));
		else
			System.out.println("Element is not present in the list");
		
		// h. to sort a given array list.
		Collections.sort(colourList);
		System.out.println("\nSorted List");
		System.out.println(colourList);
		
		// to copy one array list into another.
		List<String> copyList = new ArrayList<>();
		copyList.addAll(colourList);
		
		System.out.println("\nCopied list");
		System.out.println(colourList);
		
		// to shuffle elements in an array list.
		Collections.shuffle(colourList);
		System.out.println("\nSuffled list"+ colourList);
	}	
}	