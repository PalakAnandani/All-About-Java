//a number that ends with 7 at last or a number which is divisible by 7
import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if (num%7==0 || num%10==7)
		{
			System.out.println(num+ " is a buzz number");
		}
		else{
			System.out.println(num+ " is not a buzz number");
		}
	}
}
