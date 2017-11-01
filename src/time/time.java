package time;

import java.util.Scanner;

public class time {
	
	static Scanner a=new Scanner(System.in);  //scanner class to input the values
	static private int hours,minutes,seconds;

	public static int getHours() {
	System.out.println("enter the hours");
	hours=a.nextInt();                          //method to get hours
		return hours;
	}

	public static void setHours(int hours) {
		time.hours = hours;                 //method to set hours
	}

	public static int getMinutes() {
		System.out.println("enter the minutes");   //method to get minutes
		minutes=a.nextInt();
		return minutes;
	}

	public static void setMinutes(int minutes) {
		time.minutes = minutes;              //method to set minutes
	}

	public static int getSeconds() {
		System.out.println("enter the seconds");
		seconds=a.nextInt();               //method to get seconds
		return seconds;
	}

	public static void setSeconds(int seconds) {
		time.seconds = seconds;          //method to set seconds
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",hours,minutes,seconds);  //method to print the time format
	}
public time nextSecond()
{
	seconds++;
	return this;        //method to increment seconds
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        time ab=new time();     //object of time class
        ab.getHours();
        ab.setHours(hours);
        ab.getMinutes();
        ab.setMinutes(minutes);
        ab.getSeconds();
ab.setSeconds(seconds);
ab.nextSecond().nextSecond().nextSecond();
System.out.println(ab.toString());

	}

}
