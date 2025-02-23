import java.util.Scanner;
class Bmi
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the weight in pounds:");
		float wt= sc.nextFloat();
		System.out.println("Enter the height in inches:");
		float ht= sc.nextFloat();
		float wtTot= (wt*0.45359237f);
		float htTot= (ht*0.0254f);
		float result=(wtTot)/((htTot)*(htTot));
		System.out.println("the calculated BMI is:"+result);
	}


}