package calendar;

public class Calendar {
	private static final int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] Leap_Max_Days = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeap(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {return true;}
		else {return false;}
	}
	
	public int parseDay(String weekday) {
		switch(weekday) {
		case("Su"):
			return 1;
		case("Mo"):
			return 2;
		case("Tu"):
			return 3;
		case("We"):
			return 4;
		case("Th"):
			return 5;
		case("Fr"):
			return 6;
		case("Sa"):
			return 7;
		default:
			return 1;
		}
	}
	
	public int getMaxDays(int year, int month) {
		if (isLeap(year)) {return Leap_Max_Days[month-1];}
		else {return Max_Days[month-1];}
	}
	
	public void printCal(int year, int month, int weekday) {
		int days = getMaxDays(year, month);
		System.out.printf("    %4d년%3d월\n", year,month);
		System.out.println("---------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i=1;i<weekday;i++) {
			System.out.printf("%3s"," ");
		}
		for(int j=1;j<=days;j++) {
			System.out.printf("%3d",j);
			if (j%7 == 0 && j%7 == 7-(weekday-1)) {System.out.print("\n");}
			if (j%7 == 7-(weekday-1)) {System.out.print("\n");}
		}
		System.out.print("\n");
	}
}
