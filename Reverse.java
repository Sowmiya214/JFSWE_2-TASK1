package com.java.JFSWE_2.Task1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		int reverse = 0;
		while (num != 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}
