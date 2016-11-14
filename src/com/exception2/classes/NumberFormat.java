package com.exception2.classes;

public class NumberFormat {
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt ("xyz");
			System.out.println(num);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Number format exception occurred");
		}
			
		}
		
	}


