/*
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
*/

import java.util.*;

public class Problem2 {
	public static void main(String[] args) {
		LinkedList<Character> alphabets = new LinkedList<>();

		// a. append the specified element to the end of a linked list.
		alphabets.addLast('s');
		alphabets.addLast('u');
		alphabets.addLast('r');
		alphabets.addLast('u');
		alphabets.addLast('t');
		alphabets.addLast('h');
		alphabets.addLast('i');

		// iterate through all elements in a linked list.
		System.out.println("b. Iterating all elements:");
		for (char letter : alphabets) {
			System.out.print(letter + "  ");
		}
		System.out.println();

		// iterate through all elements in a linked list starting at the specified position.
		System.out.println("c. From index 3:");
		for (int i = 3; i < alphabets.size(); i++) {
			System.out.print(alphabets.get(i) + " ");
		}
		System.out.println();

		// d. iterate a linked list in reverse order.
		System.out.println("d. Reverse order:");
		for (int i = alphabets.size() - 1; i >= 0; i--) {
			System.out.print(alphabets.get(i) + " ");
		}
		System.out.println();

		// e. insert the specified element at the specified position in the linked list.
		alphabets.add(3, 'k');

		// f. insert elements into the linked list at the first and last position.
		alphabets.addFirst('a');
		alphabets.addLast('z');

		// g. insert the specified element at the front of a linked list.
		alphabets.addFirst('b');

		// h. insert the specified element at the end of a linked list.
		alphabets.addLast('y');

		// i. insert some elements at the specified position into a linked list.
		alphabets.add(5, 'j');

		// j. get the first and last occurrence of the specified elements in a linked list.
		int firstIndex = alphabets.indexOf('u');
		int lastIndex = alphabets.lastIndexOf('u');
		System.out.println("j. First index of 'u': " + firstIndex);
		System.out.println("   Last index of 'u': " + lastIndex);
	}
}
