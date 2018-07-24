package calendar;

import java.util.Scanner;

public class prompt {
	
	public void printmenu() {
		System.out.println("+--------------------+");
		System.out.println("| 1. 일정 등록           |");
		System.out.println("| 2. 일정 검색           |");
		System.out.println("| 3. 달력 보기           |");
		System.out.println("| h. 도움말   q. 종료    |");
		System.out.println("+--------------------+");
	}
	
	public void runprompt() {
		printmenu();
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
			String cmd = sc.next();
			if(cmd.equals("q")) {break;}
			switch(cmd) {
			case("1"): Register(); break;
			case("2"): Search(); break;
			case("3"): Cal(sc, cal); break;
			case("h"): printmenu(); break;
			case("q"): break;
			}
		}
		System.out.println("End");
		sc.close();
	}
	
	private void Search() {
		// TODO Auto-generated method stub
		
	}

	private void Cal(Scanner sc, Calendar cal) {
		int month = 1;
		int year = 1;
		int weekday = 1;
		
		System.out.print("year: ");
		year = sc.nextInt();
		
		System.out.print("month: ");
		month = sc.nextInt();
		
		weekday = cal.parseDay(cal.getWeekday(year, month));
		if(month == -1 || month > 12) {
			System.out.println("Invalid Input");
			return;
		}
		cal.printCal(year, month, weekday);
	}

	private void Register() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		prompt p = new prompt();
		p.runprompt();
	}
}
