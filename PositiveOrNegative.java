package com.java.JFSWE_2.Task1;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("zero");
		}
	}

}
