class Patterns1_1 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch= 'a';
		for (int i =1;i<=4 ;i++ )
		{
			for (int j =1;j<=i ;j++ )
			{
				System.out.print("* "); 
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i =1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(j+" " );
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i =1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(n++ +" " );
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i =1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(ch +" " );
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i =1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(ch++ +" " );
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i =1;i<=4 ;i++ )
		{
			for (; ; )
			{
			}
		}




	}
}
