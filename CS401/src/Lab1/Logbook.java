package Lab1;
import java.io.*;
import java.util.*;
import java.util.GregorianCalendar;

public class Logbook {
	
	private int logMonth,logYear;
	private int[] entry = new int[31];
	private GregorianCalendar logCalendar;
	
	public Logbook(int month, int year){
		//Checks if the month is a valid month
		if(month-1>=0 && month-1<=11){
			logCalendar = new GregorianCalendar(year,month-1,1);//create new log calendar according to user input
			logMonth=month;
			logYear=year;
		}
		//if the month is not valid
		else{
			//create a log calendar with todays date.
			logCalendar = new GregorianCalendar(logCalendar.YEAR,logCalendar.MONTH,logCalendar.DAY_OF_MONTH);
			logMonth=logCalendar.get(logCalendar.MONTH);
			logYear=logCalendar.get(logCalendar.YEAR);
		}
		//fills all the entries with 0
		for(int i=0;i<31;i++)
			entry[i]=0;
	}
	//method to put values into an entry
	public void putEntry(int day, int value){
		entry[day]=value;
	}
	
	public int getEntry(int day){
		return entry[day];
	}
	
	public int month(){
		return logMonth;
	}
	
	public int year(){
		return logYear;
	}
	
	public int daysInMonth(){
		return logCalendar.getActualMaximum(logCalendar.DAY_OF_MONTH);
	}
	
	private boolean leapYear(){
		return logCalendar.isLeapYear(logYear);
	}
}
