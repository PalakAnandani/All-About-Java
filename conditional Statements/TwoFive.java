import java.util.Scanner;
class TwoFive
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("enter the number:");
		int num= sc.nextInt();
		String op= ((num%2==0 && num%5==0))?("hiTwo hiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("hiFive"):("blank"))) ;
		System.out.print(op);
	}
}