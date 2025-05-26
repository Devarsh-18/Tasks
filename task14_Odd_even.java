package test_script.test_script;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();
		 if(number % 2  == 0) {
			 System.out.println(number + "even");}
		 else System.out.println(number+ "number is odd");
		
		

	}

}
