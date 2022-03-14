package com.xworkz.coreJava;

public class ControlStatements {

	public static void main(String[] args) {
		ControlStatements.votingSoftware();
		ControlStatements.paymentSoftware();
		ControlStatements.grade();
		ControlStatements.HotelManagement();
	}

	public static void votingSoftware() {// if statement
		byte age = 18;
		if (age >= 18) {
			System.out.println("can vote");
		}
	}

	public static void paymentSoftware() {// if else statement
		boolean serverStatus = true;
		if (serverStatus == true) {
			System.out.println("payment done successfully");
		} else {
			System.out.println("payment failed");

		}

	}

	public static void grade() {//else if statement
		int marks = 90;
		if (marks >= 35 && marks <= 40) {
			System.out.println("grade is C");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("grade is C+");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("grade is B");

		} else if (marks >= 61 && marks <= 75) {
			System.out.println("grade is B+");

		} else if (marks >= 76 && marks <= 85) {
			System.out.println("grade is A");

		} else {
			System.out.println("grade is A+");

		}
	}

	public static void HotelManagement() {//switch statement
		String category="Indian";
		switch (category){
			case "chines":
				System.out.println("Chines Food Items");
			case "Italian":
				System.out.println("Italian food items");
			case "Indian":
				System.out.println("Indian food items");
				break ;
				default:
					System.out.println("please select Indian,Italian,Chinees");
				
		}
		
			
	}
}
