import java.util.Scanner;
class EmirpOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag= true;
		int rev=0;
		for (int i = 2;i< num; i++ )
		{
			if (num%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			for (int i=num;i>=2 ;i/=10 )
			{
				rev = rev*10+(i%10);
				if (rev%i==0)
				{
					flag = false;
					break;
				}
			}
			System.out.println("emirp");
		}
		else{
			System.out.println("not emirp");
		}
	}
}