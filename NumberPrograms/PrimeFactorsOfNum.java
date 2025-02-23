import java.util.Scanner;
class PrimeFactorsOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for (int i =1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				System.out.println(i);//print factors of num 
			}
		}
		for (int i =1 ;i<=num ;i++ )
		{
			if (num%i==0)
			{
				int count=0;
				for (int j=1;j<=i ;j++)
				{
					if (i%j==0)
					{
						count++;
					}
				}
				if (count==2)
				{
					System.out.println(i+" is prime");
				}
			}

		}

	}
}