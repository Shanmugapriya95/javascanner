package com.scannerfun;

import java.util.Scanner;

public class Scanner_example {
	public static void main(String[] args) {

		System.out.println("***Scanner Program***\n");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value:");
		String c = scan.nextLine();
		System.out.println("Value:" + c);
		System.out.println();

		System.out.println("Enter the value 1:");
		String a = scan.next();
		System.out.println("value:" + a);
		System.out.println();

		System.out.println("Enter the value 2:");
		String b = scan.nextLine();
		System.out.println("Value:" + b);
		System.out.println();

		System.out.println("Boolean:");
		boolean nb = scan.nextBoolean();
		System.out.println("Boolean:" + nb);
		System.out.println();

		System.out.println("Char value:");
		int amt=scan.nextInt();
        char am=scan.next().charAt(amt);
        System.out.println(am);
	}

}
