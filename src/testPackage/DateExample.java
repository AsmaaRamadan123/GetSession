package testPackage;

import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.util.Calendar;



public class DateExample {
	
	public  void printGregorianDate () {
		

		Calendar cl=Calendar.getInstance();
		cl.getTime();
		    
		//HijrahDate islamyDate = HijrahChronology.INSTANCE.date(LocalDate.of(cl.get(Calendar.YEAR),cl.get(Calendar.MONTH)+1, cl.get(Calendar.DATE))); 
		System.out.println(cl.getTime());
		
	}
	
	public void printHijriDate () {
		Calendar cl=Calendar.getInstance();
		cl.getTime();
		    
		HijrahDate islamyDate = HijrahChronology.INSTANCE.date(LocalDate.of(cl.get(Calendar.YEAR),cl.get(Calendar.MONTH)+1, cl.get(Calendar.DATE))); 
		System.out.println(islamyDate);
		
	}

}
