package com.gl.Main;

import java.util.Arrays;
import java.util.Scanner;
import com.gl.Main.Payu_Money;
import com.gl.Main.NoteCount;


public class CurrencyCounterDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of currency Denominations");
		int size = sc.nextInt();
		
		int [] currencyArr = new int [size];
		for (int i =0; i< currencyArr.length; i++) {
			System.out.println("Enter the Denomination Value in Random Order");
			currencyArr[i]=sc.nextInt();
			
		
       
	}
		System.out.println("Before Sorting Currency: " +Arrays.toString(currencyArr));
		mergeSort(currencyArr,0,currencyArr.length-1);
		System.out.println("After Sorting currency: "+Arrays.toString(currencyArr));
		
		System.out.println("Enter the total Amount to be payed");
		int amount = sc.nextInt();
		NoteCount nc = new NoteCount();
		((NoteCount) nc).counting(currencyArr,amount);
		

	}

	private static void mergeSort(int[] currencyArr, int i, int j) {
		int high = 0;
		int low = 0;
		// TODO Auto-generated method stub
		if(low<high) {
		 int mid = (low+high)/2;
		 int[] arr = null;
		mergeSort(arr,low,mid);
		 mergeSort(arr,mid+1,high);
		 merge(arr,low,mid,high);
		}
		}
	private static void merge (int[]arr,int low,int mid,int high) {
		int i,j,k;
		i=low;
		j=mid+1;
		k=low;
		int[]temperArr= new int [high + 1];
		while(i<= mid& j <=high ) {
			
		}
	}
		
	}
