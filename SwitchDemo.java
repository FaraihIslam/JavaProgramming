package com.java.programs.practice;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		@SuppressWarnings("unused")
		var season="";
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			season="Winter Season";
			break;
		case 4:
		case 5:
		case 6:
			season="Summer Season";
			break;
		case 7:
		case 8:
		case 9:
			season="Rainy Season";
			break;
		case 10:
		case 11:
		case 12:
			season="Spring Season";
			break;
			default:
				System.out.println("Entered Invalid Month");
		}

	}

}
