import java.util.Scanner;
class PrintEveSumRev 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		int num= new Scanner(System.in).nextInt();
		int EvenSum=0;
		while (num>0)
		{
			int rem = num%10;
			if (num%2==0)
			{
				EvenSum+=rem;
			}
			num/=10;
		}
		System.out.println("the sum of even numbers is: "+EvenSum);
	}
}
