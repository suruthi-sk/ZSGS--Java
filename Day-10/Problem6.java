/*
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
*/

import java.util.*;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Character> map = new TreeMap<>();
		
		// 1. associate the specified value with the specified key in a Tree Map.
		map.put(1,'a');
		map.put(26,'z');
		map.put(2,'b');
		map.put(20,'t');
		map.put(25,'y');
		map.put(6,'f');
		map.put(15,'o');
		
		// 2. copy a Tree Map content to another Tree Map.
		TreeMap<Integer, Character> mapCopy = new TreeMap<>(map);
		
		/// 3. search a key in a Tree Map.
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		if(map.containsKey(key)) System.out.println("Key is present");
		else System.out.println("Key is not present");
		System.out.println();

		// 4. search a value in a Tree Map.
		System.out.println("Enter the value to search");
		char value = sc.next().charAt(0);
		if(map.containsValue(value)) System.out.println("Value is present");
		else System.out.println("Value is not present");
		System.out.println();
		
		// 5. get all keys from the given a Tree Map.
		
		System.out.print("Keys present : ");
		System.out.print(map.keySet());
		System.out.println();
		
		// 6. delete all elements from a given Tree Map.
		mapCopy.clear();
		
		// 7. sort keys in Tree Map by using comparator.
		Comparator<Integer> sort = (a, b) -> Integer.compare(a, b);

		TreeMap<Integer, Character> sortedMap = new TreeMap<>(sort);
		sortedMap.putAll(map);

		System.out.println("TreeMap sorted : " + sortedMap);
		System.out.println();

		
		// 8. get a key-value mapping associated with the greatest key and the least key in a map.
		System.out.println("Least key-value : "+ 	map.firstEntry());
		System.out.println("Greatest key-value : "+ 	map.lastEntry());
		System.out.println();
		
		//9. get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println("Least key : "+ 	map.firstKey());
		System.out.println("Greatest key : "+ 	map.lastKey());
		System.out.println();
		
		//10. get a reverse order view of the keys contained in a given map.
		System.out.print("Reverse order : " + map.descendingKeySet());
	}
}