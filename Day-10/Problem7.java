/*
7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
*/

import java.util.*;

public class Problem7 {
	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		// 1. associate the specified value with the specified key in a HashMap.
		map.put('a', "apple");
		map.put('d', "duck");
		map.put('l', "lap");
		map.put('g', "giga");
		map.put('v', "vector");
		map.put('q', "Queue");
		map.put('c', "computer");
		
		// 2. count the number of key-value (size) mappings in a map.
		System.out.println("Size of the map is " + map.size());
		System.out.println();
		
		// 3. copy all of the mappings from the specified map to another map.
		HashMap<Character, String> mapCopy = new HashMap<>(map);
		
		// 4. remove all of the mappings from a map.
		mapCopy.clear();
		
		// 5. check whether a map contains key-value mappings (empty) or not.
		if(map.isEmpty()) System.out.println("Map is empty");
		else System.out.println("Map contains key-value mapping");
		System.out.println();
		
		// 6. get a shallow copy of a HashMap instance.
		HashMap<Character, String> mapShallowCopy = new HashMap<>(map);
		
		// 7. test if a map contains a mapping for the specified key.
		System.out.print("Enter key to search : ");
		char key = sc.next().charAt(0);
		
		if(map.containsKey(key)) System.out.println("Key is present");
		else System.out.println("Key is not present");
		System.out.println();
		
		// 8. test if a map contains a mapping for the specified value.
		System.out.print("Enter value to search: ");
		String value = sc.next();
		
		if(map.containsValue(value)) System.out.println("Value is present");
		else System.out.println("Value is not present");
		System.out.println();
		
		// 9. create a set view of the mappings contained in a map.
		System.out.println("Mappings : ");
		System.out.println(map.entrySet());
		System.out.println();
		
		// 10. get the value of a specified key in a map.
		System.out.print("enter key value: ");
		key = sc.next().charAt(0);
		
		System.out.println("Value for key '" + key + "' is: " + map.get(key));
		System.out.println();
	}
}