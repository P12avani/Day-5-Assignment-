package com.codegnan.fundmentals;
import java.util.Scanner;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a principal:");
		double P=scanner.nextDouble();
		System.out.println("Enter rate of interest:");
		double R=scanner.nextDouble();
		System.out.println("Enter time in years:");
		double T=scanner.nextDouble();
		double simpleInterest=(P*R*T)/100;
		double totalAmount=P+simpleInterest;
		System.out.println("Simple Interest:"+simpleInterest);
		System.out.println("Total Amount:"+totalAmount);
		}
		}
	
