package Reverse;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class reverseString2 {
	public static void main(String[] args) {
		String str = "this is raja raja the great and raja this is new love";
		String[] worlds = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(worlds));
		String output = String.join(" ", set);
		System.out.println("new word: " + output);
	}

}
