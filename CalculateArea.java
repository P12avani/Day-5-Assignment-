package com.codegnan.fundmentals;
import java.util.Scanner;
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of a circle:");
		float radius=scanner.nextFloat();
		float area=(float)(Math.PI*radius*radius);
		System.out.printf("Area of the circle:%.2f",area);
		scanner.close();
		}
		}
	


