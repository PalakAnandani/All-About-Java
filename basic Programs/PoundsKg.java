import java.util.Scanner;
class PoundsKg
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter the number in pounds:");
		float pound= sc.nextFloat();
		float result= pound*0.454f;
		System.out.println( pound +"pounds is" +result);
	}

}
