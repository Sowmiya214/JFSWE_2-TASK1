package com.java.JFSWE_2.Task1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = obj.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j <= i) {
					System.out.print(n - j + " ");
				} else {
					System.out.print(n - i + " ");
				}
			}
			System.out.println();
		}

	}

}
