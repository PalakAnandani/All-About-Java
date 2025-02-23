import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		int sqr=num*num;
		int sum=0;
		for (int i = sqr;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum+=rem;
		}
		//System.out.println(sum);
		if (sum==num)
		{
			System.out.println(num+ " is a NeonNumber");
		}
		else{
			System.out.println(num+ " is not a NeonNumber");
		}
	
	}
}
//Fascinationg number w string
//Fascinationg number w/o string
//Automorphic number
//neon num
//buzz number ->%7 or contains 7 at last
//duck number -> a number that contains 0 in it but not at first
//spy number 
// sunny number