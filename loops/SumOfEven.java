import java.util.Scanner;
class SumOfEven 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number: ");
		//num is int i
		int num = new Scanner(System.in).nextInt(); //123
		int dup=num;
		int sum =0; //3
		// 0>0 -> false
		while (num>0)
		{
			// int 1%10 -> 1 rem
			int rem= num%10; //last digit 
			sum+=rem; //5+1=6
			// 1/10 -> 0 num
			num/=10; //update by removing the last digit
		}
		System.out.println(sum);
		System.out.println(dup);
	}
}
//int sum=123456
//int sum=0
//for (;num>0 ; )
//{
//}