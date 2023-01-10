package Reverse;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class removeDuplicates {
  public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter a sentence: ");
		 */
    String input = "i love you my love";
    String[] words = input.split(" ");
    LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(words));
    String output = String.join(" ", set);
    System.out.println("The sentence with duplicates removed is: " + output);
  }
}