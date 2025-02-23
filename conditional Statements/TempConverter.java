import java.util.Scanner;
class TempConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the temperature in degree : ");
		double temp= sc.nextDouble();
		System.out.println("1.convert from degree to fah : ");
		System.out.println("2.convert from degree to kelvin : ");
		System.out.println("3.convert from degree to rankine : ");
		Double opt = sc. nextDouble();
		if (opt==1)
		{
			System.out.println((9.0/5) * temp +32);
		}
		else if (opt==2)
		{
			System.out.println((temp+ 273.15));
		}
		else if (opt==3)
		{
			System.out.println((temp*(9.0/5)+491.67));
		}

	}
}
