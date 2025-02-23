import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		boolean flag=true;
		for (int i =2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("it is a prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}
}
// make a number prime if not
//find the next prime and prev prime of the given num print both if they are at equidist or else print the nearest prime
//password
//if the entered num and the rev of it, both are prime then print its is an EMIRP num 13 -> 31 (Emirp)
//testcase