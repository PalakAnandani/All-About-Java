import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("    CURRENCY CONVERTER");
		System.out.println();
		System.out.print("Enter the amount (INR) : ");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY: ");
		System.out.println("1. USD");
		System.out.println("2. EURO");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println();	

		System.out.println("Enter the currency");
		String curr= sc.next().toUpperCase();
		float conCurr=0;
		if (curr.equals("USB"))
		{
			conCurr=inr/86.56f;
			System.out.println(inr +" INR = "+conCurr+ " USD");
		}
		else if (curr.equals("EURO"))
		{
			conCurr=inr/90.25f;
			System.out.println(inr +" INR = "+conCurr+ " EURO");
		}
		else if (curr.equals("GBP"))
		{
			conCurr=inr/107.652f;
			System.out.println(inr +" INR = "+conCurr+ " GBP");
		}
		else if (curr.equals("PKR"))
		{
			conCurr=inr/0.3100f;
			System.out.println(inr +" INR = "+conCurr+ " PKR");
		}
		else
		{
			System.out.println("INVALID CURRENCY");
		}

	}
}
