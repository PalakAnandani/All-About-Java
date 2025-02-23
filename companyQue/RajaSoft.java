import java.util.Scanner;
class RajaSoft
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number : ");
		int num = new Scanner (System.in).nextInt();
		int nprime=0;
		int pprime=0;

		for (int i=num-1;i>=2 ;i-- )// if num = 15 --> the loop will start from 14 to 2... the loop is for prev prime num
		{
			boolean flag = true; // assuming the num entered is prime
			for (int j =2 ;j<i ;j++ ) //loop from 2 to i
			{
				if (i%j==0) //(ie 2%14 (not a prime), 2%13(prime)
				{
					flag = false; // flag will turn to false if not prime 
					break;
				}
			}
			if (flag)
			{
				pprime=i;
				break;
			}
		}
		for (int i=num+1; ;i++ )
		{
			boolean flag = true;
			for (int j=2;j<i;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				nprime = i;
				break;
			}
		}
		if (num-pprime<nprime-num)
		{
			System.out.println(pprime+" "+num);
		}
		else if (num-pprime > nprime -num)
		{
			System.out.println(num+" "+nprime);
		}
		else
			System.out.println(pprime+" "+num+" "+nprime);
			
	}
}
