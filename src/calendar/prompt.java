package calendar;

import java.util.Scanner;

public class prompt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 1;
		int day = 1;
		while(true) {
			System.out.print("year: ");
			year = sc.nextInt();
			System.out.print("month: ");
			month = sc.nextInt();
			if(month == -1) {break;}
			if(month>12) {continue;}
			day = cal.getMaxDays(year, month);
			cal.printCal(year, month, day);
		}
		System.out.println("End");
		sc.close();
		}
	}
