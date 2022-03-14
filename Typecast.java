package com.xworkz.coreJava;

public class Typecast {
	public static void main(String args[]) {
		Typecast.implicitTypecasting();
		Typecast.explicitTypecasting();
		explicit2();
		explicit3();
		explicit4();
	}

	public static void implicitTypecasting() {// converting int to double using implicit typeCasting
		int num = 10;
		System.out.println(num);
		double data = num;
		System.out.println(data);

	}

	public static void explicitTypecasting() {// converting double to int using explicit typeCasting
		double num = 10;
		System.out.println(num);
		int data = (int) num;
		System.out.println(data);
	}

	public static void explicit2() {// converting int to String using explicit typeCasting
		int num = 10;
		System.out.println(num);
		String data = String.valueOf(num);
		System.out.println(data);
	}

	public static void explicit3() {// converting string to int using explicit typeCasting
		String num = "10";
		System.out.println(num);
		int data = Integer.parseInt(num);
		System.out.println(data);
	}

	public static void explicit4() {// converting string to double using explicit typeCasting
		String num = "10";
		System.out.println(num);
		double data = Double.valueOf(num);
		System.out.println(data);
	}

}
