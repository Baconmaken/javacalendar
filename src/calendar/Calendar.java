package calendar;

public class Calendar {
	private static final int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] Leap_Max_Days = {31,29,31,30,31,30,31,31,30,31,30,31};
	private static final int[] Space = {6,0,1,2,3,4,5};
	private static final int[] Modday_of_Sa = {1,0,6,5,4,3,2};
	
	public boolean isLeap(int year) { //윤년
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {return true;}
		else {return false;}
	}
	
	public int parseDay(String weekday) {//요일→수
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
			return 0;
		default:
			return 1;
		}
	}
	
	public int getMaxDays(int year, int month) {
		if (isLeap(year)) {return Leap_Max_Days[month-1];}
		else {return Max_Days[month-1];}
	}
	
	public String getWeekday(int year, int month) {
		if(month==1||month==2) {
			month = (month==1) ? 13 : 14;
			year = year -1;
		}
		int DayofWeek = (1 + (13 * (month + 1)) / 5 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
		switch(DayofWeek) {
		case(0): return "Sa";
		case(1): return "Su";
		case(2): return "Mo";
		case(3): return "Tu";	
		case(4): return "We";
		case(5): return "Th";
		case(6): return "Fr";
		default: return "Sa";
		}
	}
	
	public void printCal(int year, int month, int weekday) {//달력출력
		int days = getMaxDays(year, month);
		System.out.printf("    %4d년%3d월\n", year,month);
		System.out.println("---------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i=1;i<=Space[weekday];i++) {
			System.out.printf("%3s"," ");
		}
		for(int j=1;j<=days;j++) {
			System.out.printf("%3d",j);
			if (j%7 == Modday_of_Sa[weekday]) {System.out.print("\n");}
		}
		System.out.print("\n");
	}
}
