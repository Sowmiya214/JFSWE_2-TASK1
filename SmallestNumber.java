package com.java.JFSWE_2.Task1;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int result = Math.min(Math.min(a, b), c);
		System.out.println("The smallest number is: " + result);

	}

}
