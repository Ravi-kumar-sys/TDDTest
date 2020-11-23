package com.wt.nt;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class StringCalculator {
	
	public int add(String numbers) throws Exception {
		
		int sum=0;
		int sum1=0;
		int ascii=0;
		
		for(int i=0;i<numbers.length();i++) {
			ascii=48;
			for(int j=0;j<=10;j++) {
				
				if(numbers.charAt(i)==ascii) {
					sum1=Character.getNumericValue(numbers.charAt(i));
					sum=sum+sum1;
					ascii++;
				}
				
				if(numbers.charAt(i)<48) {
					throw new Exception("“negatives not allowed");
				}	
				
				if(numbers.charAt(i)>1001) {
					
				}
			}
		}
		return sum;
	}
	
	 public int GetCalledCount(String s) throws Exception {
		 int count=0;
		int i=add(s);
		 count++;
		 
		 return count;
	 }
	
	
	public static void main(String args[]) {
  
		StringCalculator sc=new StringCalculator();
		Scanner scn=new Scanner(System.in);
		String numbers=scn.next();
		try {
			System.out.println(sc.add(numbers));
			System.out.println(sc.GetCalledCount(numbers));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
