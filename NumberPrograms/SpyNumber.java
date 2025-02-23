import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum=0;
		int mul=1;
		for (int i =num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum+=rem;
			mul*=rem;
		}
		if (sum==mul)
		{
			System.out.println(num+"it is a spy number");
		}
		else{
			System.out.println(num+"it is not a spy number");
		}
		
	}
}
