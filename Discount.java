package com.java.JFSWE_2.Task1;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Purchase Amount");
		int purchase_amount = obj.nextInt();
		double discount = 0.0;
		if (purchase_amount < 500) {
			discount = 0.0;
			System.out.println(
					"The purchase_amount is " + purchase_amount + ",  its less than 500 So no discount is applied");
		} else if (500 <= purchase_amount && purchase_amount <= 1000) {
			discount = 0.1 * purchase_amount;
			System.out.println("The purchase_amount is " + purchase_amount
					+ ", its between 500 to 1000 So 10% discount is applied,and the discount amount is: " + discount);
		} else if (purchase_amount > 1000) {
			discount = 0.2 * purchase_amount;
			System.out.println("The purchase_amount is " + purchase_amount
					+ " ,its  greater than 1000 So 20% discount is applied,and the discount amount is: " + discount);
		}
		double payable_amount = purchase_amount - discount;
		System.out.println("purchase_amount: " + purchase_amount);
		System.out.println("discount applied: " + discount);
		System.out.println("final payable_amount: " + payable_amount);

	}

}
