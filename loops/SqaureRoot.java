import java.util.Scanner;
class SqaureRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		//boolean flag= false; 
		for (int i =1;i<=num ;i++ )
		{
			if (i*i==num)
			{
				//flag= true;
				System.out.println(i+ " is a perfect Sqrt for" +num);
				break;
			}
			if (i*i >num)
			{
				System.out.println(num + " is not having a perfect sqaure root");
				break;
			}
		}
	}
}   

//find the sum of digits of a number
// find the sum of even sum and odd sum 
//find the product of digits in a number
//bank
//factorial
// sum of factorial of a digit
// sum of odd digits factorial
// find the factors of a number
// find the perfect sqaureroot of a number if not display number doesnt have a perfect sqaurerro
// sum of factors of a numbers
// prime number program
//power program