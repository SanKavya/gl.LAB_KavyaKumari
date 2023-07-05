package com.gl.Main;
// International transaction question!!

import java.util.Scanner;
import java.util.Arrays;

public class Payu_Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of currency Denominations");
		int size = sc.nextInt();
		
		int [] currencyArr = new int [size];
		for (int i =0; i< currencyArr.length; i++) {
			System.out.println("Enter the Denomination Value in Random Order");
			currencyArr[i]=sc.nextInt();
			
		}
	  
		System.out.println("Before Sorting Currency: "+Arrays.toString(currencyArr));
		

	}
     private static void mergeSort(int[] arr, int low, int high) {
    	 if(low<high) {
    		 int mid = (low+high)/2;
    		 mergeSort(arr,low,mid);
    		 mergeSort(arr,mid+1,high);
    		 merge(arr,low,mid,high);
    		 
    	 }
     }
     private static void merge(int[] arr,int low,int mid,int high) {
    	 int i,j,k;
    	 i=low;
    	 j=mid+1;
    	k=low;
    	int[] tempArr = new int [high+1];
//    	
    	 
     }
}
