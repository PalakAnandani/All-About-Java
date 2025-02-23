import java.util.Scanner;
class KrishOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number : ");
		int num =sc.nextInt();
		int fact=1;
		int sum=0;
		for (int i =nu )
		{
			int rem = num%10;
			for (int j= rem ;j>=1 ;j-- )
			{
				fact*=j;
			}
			sum+=fact;
		}
		System.out.println(sum);
	}
}
