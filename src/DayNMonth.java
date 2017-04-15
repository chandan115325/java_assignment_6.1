import java.util.*;
public class DayNMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring two arrays to store month name and the no of  days in that month
		int input;
		Scanner sc = new Scanner(System.in);
		
		String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
		int  days_month[]={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(" 1. january  "+" 2. february "+" 3. march "+" 4. april "+"\n "+"5. may "+" 6. june "+" 7. july "+" 8. august "+" 9. september "+"\n"+" 10. october "+" 11. november "+" 12. december " );
		System.out.println("Enter the choice to find out no of days in respective month :");
		
		input = sc.nextInt();
		
		switch(input)
		{
			case 1:
			{
				System.out.println("no of days in january :"+days_month[0]);
				break;
			}
			
				
			case 2:
			{
				System.out.println("no of days in feb :"+days_month[1]);
				break;
			}
			
			case 3:
			{
				
				System.out.println("no of days in march :"+days_month[2]);
				break;
			}
			
			case 4:
			{
				System.out.println("no of days in April :"+days_month[3]);
				break;
			}
			
			case 5:
			{
				System.out.println("no of days in may :"+days_month[4]);
				break;
			}
			
			case 6:
			{
				System.out.println("no of days in june :"+days_month[5]);
				break;
			}
			
			case 7:
			{
				System.out.println("no of days in july :"+days_month[6]);
				break;
			}
			
			case 8:
			{
				
				System.out.println("no of days in august :"+days_month[7]);
				break;
			}
			
			case 9:
			{
				System.out.println("no of days in sept :"+days_month[8]);
				break;
			}
			
			case 10:
			{
				System.out.println("no of days in oct :"+days_month[9]);
				break;
			}
			
			case 11:
			{
				System.out.println("no of days in nov :"+days_month[10]);
				break;
			}
			
			case 12:
			{
				System.out.println("no of days in dec :"+days_month[11]);
				break;
			}
			default:
				System.out.println("chose the option.");
				break;
		}
		
		
	}

}