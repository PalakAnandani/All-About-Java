import java.util.Scanner;
class LoanCalc 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("    LOAN CALCULATOR");
		System.out.println();
		System.out.println("Enter the Principal amount: ");
		float amount=sc.nextFloat();
		System.out.println("enter the ROI :");
		float roi= sc.nextFloat();
		System.out.println("Enter the tenure(Months)");
		int month = sc.nextInt();
		//concadinate from months to years
		String str= (month/12)+"."+(month%12);
		float con= Float.parseFloat(str);

		float intYear= amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : " +totalInter);
		float outstanding = amount+totalInter;
		System.out.println("Total outstanding amount : " + outstanding);
		System.out.println("EMI : "+(outstanding/month)+ "rs");
	}
}
