/*
5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
‌
*/

import java.util.*;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<String> colors = new PriorityQueue<>();
		
		// 1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
		colors.add("Violet");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Black");
		colors.add("Brown");

		System.out.println(colors);
		
		// 2. iterate through all elements in priority queue.
		for(String colour : colors) {
			System.out.print(colour + " ");
		}
		System.out.println();
		
		// 3. add all the elements of a priority queue to another priority queue.
		PriorityQueue<String> colorsCopy = new PriorityQueue<>(colors);
		
		//  4. insert a given element into a priority queue.
		String addColour = sc.next();
		colors.add(addColour);
		
		// 5. remove all the elements from a priority queue.
		colorsCopy.clear();
		
		// 6. count the number of elements in a priority queue.
		System.out.println("Number of elements in the priority queue is " + colors.size());
		
		// 7. compare two priority queues.
		colorsCopy = new PriorityQueue<>(colors);
		if(new TreeSet<>(colors).equals(new TreeSet<>(colorsCopy))) {
			System.out.println("Same");
		} else{
			System.out.println("Different");
		}
		
		// 8. retrieve the first element of the priority queue.
		System.out.println("First element : " + colors.peek());
		
		// 9. retrieve and remove the first element.
		System.out.println("First element : " + colors.poll()+ " is retrieved and removed");
		
		// 10. convert a priority queue to an array containing all of the elements of the queue.
		String[] colourArray = new String[colors.size()];
		
		int i = 0;
		
		for(String colour : colors) {
			colourArray[i++] = colour;
		}
		
		for(String s : colourArray) {
			System.out.print(s + " ");
		}
	}
}