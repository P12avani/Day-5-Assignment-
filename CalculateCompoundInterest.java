package com.codegnan.fundmentals;
import java.util.Scanner;
public class CalculateCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Principal:");
		double P=scanner.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double R=scanner.nextDouble();
		System.out.println("Enter Time in years:");
		double T=scanner.nextDouble();
		double amount=P* Math.pow((1+R/100),T);
		double compoundInterest=amount-P;
		System.out.println("Amount:"+amount);
		System.out.println("compound Interest:"+compoundInterest);
	}

}
