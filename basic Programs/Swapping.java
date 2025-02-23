class Swapping
{
	public static void main(String [] args)
	{
		int a=10;
		int b=5;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		int temp=a;
		a=b;
		b=temp;

		System.out.println("AFTER SWAPPING");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}


//WITHOUT 3RD VARIABLE

class Swapping
{
	public static void main(String [] args)
	{
		int a=20;
		int b=30;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		int a=a+b;
		int b=a-b;
		int a=a-b;

		System.out.println("AFTER SWAPPING");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
    }  

}