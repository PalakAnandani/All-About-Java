import java.util.Scanner;
class periOfCircle
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of radius: ");
		float r= sc.nextFloat();
		final float pi= 22/7;
		float peri= 2*pi*r;
		System.out.println("Perimeter of circle is: "+peri+ "cm^2");
	}
}