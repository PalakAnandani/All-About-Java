class SeriesProgram2 //2,6,22,278,65814 
{
	public static void main(String[] args) 
	{
		int num=2;
		for (int i=2,p=2;i<=5 ;i++,p*=2 )
		{
			int pow=1;
			for (int j =1; j<=p;j++ )
			{
				pow*=2;
			}
			//System.out.println(i+":"+p+":"+pow+":"+num);
			System.out.println(pow+num+ " ");
			num+=pow;
		}
	}
}
