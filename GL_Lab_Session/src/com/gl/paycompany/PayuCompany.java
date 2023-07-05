package com.gl.paycompany;

import java.util.Arrays;
import java.util.Scanner;

public class PayuCompany {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for(int i=0; i<transactions.length;i++) {
			System.out.println("Enter the Daily Income");
			transactions[i] = sc.nextInt();
		}
		System.out.println("Given Transaction Array : "+Arrays.toString(transactions));
		System.out.println("enter the total no.of targets that need to be acheived ");
		int numberofTarget = sc.nextInt();
		for (int i=0; i<numberofTarget;i++) {
			System.out.println("Enter the amount of target : ");
			int targetAmount = sc.nextInt();
			int sum=0;
			for(int j=0; j<transactions.length;j++) {
				
				sum+=transactions[j];
				if(sum>=targetAmount) {
					System.out.println("Target achieved after"+(j+1)+"transactions ");
				  break;
				}
				else 
					System.out.println("Given target is not acheived");
			}
		}
		
	}
	
	

}
