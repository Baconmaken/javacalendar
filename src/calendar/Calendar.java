package calendar;

public class Calendar {
	private static final int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] Leap_Max_Days = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	private boolean isLeap(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {return true;}
		else {return false;}
	}
	
	public int getMaxDays(int year, int month) {
		if (isLeap(year)) {return Leap_Max_Days[month-1];}
		else {return Max_Days[month-1];}
	}
	
	public void printCal(int year, int month, int day) {
		System.out.printf("    %4d년%3d월\n", year,month);
		System.out.println("---------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i=1;i<=day;i++) {
			System.out.printf("%3d",i);
			if (i%7 == 0) {System.out.print("\n");}
		}
		System.out.print("\n");
	}
}
