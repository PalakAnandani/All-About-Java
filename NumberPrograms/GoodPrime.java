import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		boolean flag = true;
		for (int i =2;i< num ;i++ )
		{
			if (num%i==0)
			{
				flag = false ;
				break;
			}
		}
		for (int i=num ;i>2 ;i/=10 )
		{
			int rem = num%10;
			if (rem%i==0)
			{
				flag = false;
				break;
			}

		}
		if (flag)
		{
			System.out.println("good prime num ");
		}
		else{
			System.out.println("not");
		}
	}
}
