package time;

import java.util.Scanner;
class invalidDay extends Exception
{
	invalidDay(String msg)
	{                                           //exception for invalid days
		super(msg);
	}
}
class invalidMonth extends Exception
{
	invalidMonth(String msg)
	{                                   //exception for invalid month
		super(msg);
	}
}

public class date {
private static int day;

private static int month;

private static int year;

Scanner sc=new Scanner(System.in);

	public int getDay() {
		System.out.println("enter the day");  //method to get day
		day=sc.nextInt();
	return day;
}

public void setDay(int day) throws invalidDay {
	if(day<=1 || day>31)
	{
		throw new invalidDay("enter the correct day"); //method to set day
	}
	this.day = day;
}


public int getMonth() {
	System.out.println("enter the month");
month=sc.nextInt();	                               //method to get month
	return month;
}


public void setMonth(int month) throws invalidMonth {
		if(month<=1 || month>12)
		{
			throw new invalidMonth("enter the correct month");
		}                                     //method to set month
	this.month = month;
}


public int getYear() {
	System.out.println("enter the year");
	year=sc.nextInt();                  //method to get year
	return year;
}


public  void setYear(int year) {
	this.year = year;      //method to set year
}

public  void setDate(int day,int month,int year)
{
	this.day=day;
	this.month=month;       //method to set day,month and year
	this.year=year;
}



	@Override
public String toString() {
		//String temp = null;
		return String.format("%02d/%02d/%04d",day,month,year);  //method to print date format
}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		date dt=new date();  //object of date class
		dt.getDay();
		dt.setDay(day);
		dt.getMonth();
		dt.setMonth(month);
		dt.getYear();
		dt.setYear(year);
		System.out.println(dt.toString());
	}

}
