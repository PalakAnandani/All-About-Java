import java.util.Scanner;
class SeriesProgram1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the Starting point:");
		int start= sc.nextInt();
		System.out.println("enter the ending point: ");
		int end= sc.nextInt();

		for (int i=start;i<=end ;i++ )
		{
			int pow=1;
			int p= i%2==0 ? 2: 3;
			for (int j=1;j<=p ;j++ )
			{
				pow*=i;
			}
			System.out.print(pow+" ");
		}

	}
}

//series- 10,13, 68, 130, 222
//series- 79,108,139,176,217,260
//series- 1,3,9,33,153,273
//find all prime numbers between user entered range
//find the count of good primes
//series 0,1,1,2,3,5,8,13....