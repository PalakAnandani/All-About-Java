import java.util.Scanner;
class SubtotGratuity{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the bill:");
		float bill= sc.nextFloat();
		System.out.println("Enter the tip rate:");
		float tipRate=sc.nextFloat();
		float tipAmount= (bill*tipRate)/100;
		float totalBill= bill+tipAmount;
		System.out.println("the total bill is: "+totalBill);
		System.out.println("tip added is :" +tipAmount);
	}
}


			

