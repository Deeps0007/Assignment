package com.raghavx.calendar;



public class CalendarDemo  {
	
	
	
	
	public void days(Day day)
	{
		System.out.println(day);
	}
	
	public void months(Month m)
	{
		System.out.println(m);
	}
	
	
	
	
public static void main(String[] args) {
	
	CalendarDemo cd=new CalendarDemo();
	cd.days(Day.Monday);
	cd.days(Day.Tuesday);
	cd.days(Day.Thursday);
	cd.months(Month.December);
	cd.months(Month.April);
	cd.days(Day.Wednesday);
	cd.months(Month.March);
	cd.months(Month.May);
	
	
	
}	
	

}
