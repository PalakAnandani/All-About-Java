import java.util.Scanner;
class AreaAndPeriOfRect{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for width:");
		float w= sc.nextFloat();
		System.out.println("Enter the value for height:");
		float h= sc.nextFloat();
		float area=w*h;
		System.out.println("the area of rectangle is:"+area);
	}
}