package com.java.programs.practice;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Example
		int age=25;
		if(age>20) {
			System.out.println("He is Elder in his Family");
		}else
		{
			System.out.println("He is Yonger in his Family");
		}
		
		System.out.println("-----------------------------");
		
		//Second Example
		int num=75;
		if(num==75) {
			if(num%3==0) {
				System.out.println("Number is divisible by 3");
			}else
			{
				System.out.println("Number is not divisible by 3");
			}
		}else {
			System.out.println("The number is less than 75");
		}

	}

}
