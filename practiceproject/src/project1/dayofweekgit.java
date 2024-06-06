package project1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class dayofweekgit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the date (yyyy-mm-dd)");
		String inputdate=scan.nextLine();	
		LocalDate date=LocalDate.parse(inputdate);
		DayOfWeek day=date.getDayOfWeek();
		System.out.println(day);
		if(isweekend(day)){
			 System.out.println(day + " is a happyweekend.");
		}else {
			 System.out.println(day + " is a weekday.");
		}
				
	}
	
	 private static boolean isweekend(DayOfWeek ans) {
		 return ans == DayOfWeek.SATURDAY || ans == DayOfWeek.SUNDAY;
	 }
	 
}
