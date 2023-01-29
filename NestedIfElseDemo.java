package com.java.programs.practice;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		
		if(month>=1 && month<=3) {
			System.out.println("Winter Season");
		}else if(month>=4 && month<=6) {
			System.out.println("Summer Season");
		}else if(month>=7 && month<=9) {
			System.out.println("Rainy Season");
		}else if(month>=10 && month<=12){
			System.out.println("Spring Season");
		}else {
			System.out.println("You have Enetered invalid month");
		}

	}

}
