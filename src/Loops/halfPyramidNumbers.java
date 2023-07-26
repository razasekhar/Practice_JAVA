package Loops;

import java.util.Scanner;

public class halfPyramidNumbers {
	public static void main(String args[]) {
		
	}
	public static void main() {
		int i,j,n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of lines: ");
		n = scanner.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++);{
				System.out.println(j);
			}
			System.out.println();
		}
		
		
	}

}
