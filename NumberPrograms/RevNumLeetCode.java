import java.util.Scanner;
class RevNumLeetCode 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;
		if (num<0)
		{
			flag = true; // if num -ve
			num = Math.abs(num);
		}
		long rev=0;
		for (int i =num ;i>0 ;i/=10 )
		{
			rev = rev*10 + (i%10);	
		}
		if (flag)
		{
			rev = rev * (-1);
		}
		if (rev >Integer.MAX_VALUE || rev <Integer.MIN_VALUE)
		{
			System.out.println(0);
		}
		else{
			System.out.println(rev);
		}
	}
}
