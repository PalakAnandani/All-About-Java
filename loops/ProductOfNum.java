import java.util.Scanner;
class ProductOfNum{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int product=1;
		int rem =0;
		while (num>0)
		{
			rem = num%10;
			product*=rem;
			num/=10;
		}
		System.out.println(product);
	}
}