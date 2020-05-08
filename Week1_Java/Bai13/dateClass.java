package date_13;
import java.util.Scanner;

public class dateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 0, month = 0, year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input day :");
		day = sc.nextInt();
		System.out.println("Please input month :");
		month = sc.nextInt();
		System.out.println("Please input year :");
		year = sc.nextInt();
		
		switch(month)
		{
		case 1:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 2:
			if(year%4==0)
			{
				if(day<0 || day > 29)
				{
					System.out.println("illegal day");
					break;
				}
				System.out.println("Have 29 day");
			}
			else
			{
				if(day<0 || day > 28)
				{
					System.out.println("illegal day");
					break;
				}
				System.out.println("Have 28 day");
			}
			break;
		case 3:
			
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 4:
			if(day<0 || day > 30)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 30 day");
			break;
		case 5:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 6:
			if(day<0 || day > 30)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 30 day");
			break;
		case 7:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 8:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 9:
			if(day<0 || day > 30)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 30 day");
			break;
		case 10:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		case 11:
			if(day<0 || day > 30)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 30 day");
			break;
		case 12:
			if(day<0 || day > 31)
			{
				System.out.println("illegal day");
				break;
			}
			System.out.println("Have 31 day");
			break;
		}
	}
}
