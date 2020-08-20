package com.goibibo.qa.roundtripTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class javaBasics {

	public static void main(String[] args) {
		reverse();
		MaxAndMin();
		findingCharacters();
		unwantedChracterRemove();
		FindSecondHighestNumber();
		FindSecondHighestCharacter();
		swap();
		findDulicatevaleue();

	}

	public static void reverse() {
		StringBuffer sb = new StringBuffer("ramakrishna");
		System.out.println(sb.reverse());
	}

	public static void MaxAndMin() {
		int[] array = { 1, 2, 4, 5, 6 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
			if (array[i] <= min) {
				min = array[i];
			}
		}

		System.out.println("max is:" + max + "min is:" + min);
	}

	public static void findingCharacters() {
		String str = "ramakrishnaElectrical";
		Map<Character, Integer> count = new HashMap<>();
		for (Character c : str.toCharArray()) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}

	public static void unwantedChracterRemove() {
		String str = "ram123!@#$$>/";
		str = str.replaceAll("[^a-zA-z]", "");
		System.out.println(str);
	}

	public static void FindSecondHighestNumber() {
		int[] array = { 2, 4, 6, 7, 8, 9 };
		// for (int i = 0; i <= array.length; i++) {
		System.out.println(array[array.length - 2]);

		// }
	}

	public static void FindSecondHighestCharacter() {
		String str[] = { "ab", "c", "d" };
		Arrays.sort(str);
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] == str[i + 1]) {
				System.out.println("duplicateCharacteris"+str[i]);
			}
			
		}
	}
	public static void swap() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a is:" + a + "b is" + b);
	}


	public static void findDulicatevaleue() {
		String duplicates[] ={ "java", "spring", "hibernate", "java" };
		Arrays.sort(duplicates);
		for (int i = 0; i < duplicates.length - 1; i++) {
			if (duplicates[i] == duplicates[i + 1]) {
				System.out.println("duplicate string is:" +duplicates[i]);
			}
		}
	}
	
}
