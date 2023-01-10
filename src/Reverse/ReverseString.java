package Reverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter new striing :");
		String input = scanner.nextLine();
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println("reverse string :" + reverse);
		
		
	}

}
