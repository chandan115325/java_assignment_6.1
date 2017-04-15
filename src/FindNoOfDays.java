import java.util.*;

public class FindNoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day,year,month,leapYearCount,total_months_current_year=0;
		
		//array declared to store the day in all months
		
		int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out the no of days from January 1 to the provided date :");
		System.out.println("Input the required date as mm-dd-yyyy :");
		System.out.print("Input the month :");
		month = sc.nextInt();
		System.out.print("Input the date :");
		day=sc.nextInt();
		System.out.print("Input the year :");
		year = sc.nextInt();
		
		System.out.println(month+"-"+day+"-"+year);
		
		//To calculate no of leap years to count the extra days
		
		leapYearCount=(year/4)-(year/100)+(year/400);
		int no_of_months = month - 1;
		
		int no_of_day = day-1;
		for(int i =0;i<no_of_months;i++)
		{
			total_months_current_year+=month_days[i];
		}
		//calculating total no of day from january 1 till input date
		
		int total_day = 365*year + leapYearCount +no_of_day+total_months_current_year;
		System.out.println("Total no of days from january 1 :"+total_day+" days ");
	}

}
