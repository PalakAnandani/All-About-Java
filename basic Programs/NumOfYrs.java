import java.util.Scanner;
class NumOfYrs
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the minutes:");
		int min = sc.nextInt();
		int minYear= 365*24*60; //days,hours,minutes (total number of minutes in year)(525600)
		int totYrs= min/minYear;
		int totDays= (min-(totYrs*minYear))/(24*60) ;
		//int totDays = (min%minYear)/(24*60);
		System.out.println("the total numbers of years is "+ totYrs + " and " +totDays+ " Days");
	}
}