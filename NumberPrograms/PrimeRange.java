import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the starting point: ");
		int start= sc.nextInt();
		System.out.println("enter the ending point: ");
		int end = sc.nextInt();
		for (int i=start;i<=end ;i++ )
		{
			boolean flag = true;
			for (int j =2; j<i ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				System.out.println("the range of prime numbers is "+i);
			}
		}
	}
}