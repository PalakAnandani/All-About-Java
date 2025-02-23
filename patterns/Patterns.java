class Patterns 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			//loop to print space
			for (int j =1; j<=5-i ;j++ )
			{
				System.out.print("  ");
			}
			//loop to print stars
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(" *");
			}
			System.out.println();
		}//left angle triangle
		System.out.println()
		for (int i=1;i<=5 ;i++ )
		{
			//loop to print space
			for (int j =1; j<=5-i ;j++ )
			{
				System.out.print(" ");
			}
			//loop to print stars
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(" *");
			}
			System.out.println();
		}//full triangle
		System.out.println()
		for (int i=1;i<=5 ;i++ )
		{
			//loop to print stars
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(" *");
			}
			System.out.println();//right angle triangle
		}
	
	}
}