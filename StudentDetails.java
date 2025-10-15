package com.codegnan.fundmentals;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=scanner.nextLine();
		System.out.println("Enter roll number:");
		int rollNumber=scanner.nextInt();
		System.out.println("Enter age:");
		int age=scanner.nextInt();
		System.out.println("Enter grade:");
		String grade=scanner.next();
		System.out.println("\n--- Student Details---");
		System.out.println("Name:"+name);
		System.out.println("roll Number:"+rollNumber);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);
		scanner.close();
	}

}
