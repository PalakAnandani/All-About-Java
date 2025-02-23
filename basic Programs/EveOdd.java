import java.util.Scanner;
class EveOdd
{
	public static void main(String [] args)
	{
	  //  Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=new Scanner(System.in).nextInt(); 
		System.out.println((num/2)*2==num);
		//System.out.println(num/2==num/2.0);
	}
}