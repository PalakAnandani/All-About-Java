import java.util.Scanner;
class SumOfFactorsOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int count=0;
		int sum=0;
		for (int i = 1; i<=num ;i++ )
		{
			if (num%i==0)
			{
				sum+=i;
				count++;
				System.out.println(" "+i);
			}
		}


		System.out.println("the sum of digits of factors is : " +sum);
		System.out.println("the count is: "+count);
	}
}
