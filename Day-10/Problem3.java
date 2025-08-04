/*
3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
*/

import java.util.*;

public class Problem3 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		// a. append the specified element to the end of a hash set.
		set.add(100);
		set.add(230);
		set.add(450);
		set.add(130);
		set.add(140);
		set.add(100);
		set.add(100);
		
		// b. iterate through all elements in a hash list.
		System.out.println("\nIterating through hash set");
		for(int num : set) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		// c. get the number of elements in a hash set.
		System.out.println("\nNumber of elements in the hash set: " + set.size());
		
		// d. empty the hash set.
		set.clear();
		System.out.println("\nAll elements in hash set are cleared");
		
		// e. test a hash set is empty or not.
		if(set.isEmpty())
			System.out.println("\nset is empty");
		else 
			System.out.println("\nSet is not empty");
		
		set.add(100);
		set.add(230);
		set.add(450);
		set.add(130);
		set.add(140);
		set.add(100);
		set.add(100);
		
		// f. clone a hash set to another hash set.
		HashSet<Integer> setCopy = new HashSet<>(set);
		
		// g. convert a hash set to an array.
		Integer[] arr = set.toArray(new Integer[0]);
		System.out.println("\nConverted array:");
		for(Integer val : arr){
			System.out.print(val + "\t");
		}
		System.out.println();
		
		// h. convert a hash set to a tree set.
		Set<Integer> treeSet = new TreeSet<>(set);
		
		System.out.println("\nPrinting tree set");
		for(int num : treeSet) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		// i. convert a hash set to a List/ArrayList.
		List<Integer> list = new ArrayList<>(set);
		
		System.out.println("\nPrinting Array list");
		for(int num : list) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		// j. compare two hash set.
		if(set.equals(setCopy)) {
			System.out.println("\nTwo hash set are Same");
		} else {
			System.out.println("\nTwo hash set are not same");
		}
	}
}
