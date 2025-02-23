import java.util.Scanner;
class FactorsPrimeNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enetr the number: ");
		int num = sc.nextInt();
		int count=0;
		for (int i =2;i<num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}	 
		}
		System.out.println(count==0? num+ " is prime " :num+ " is not prime");
	}
}