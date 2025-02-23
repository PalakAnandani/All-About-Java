class MaxAmongAll 
{
	public static void main(String[] args) 
	{
		int num =58957367;
		int max =0;
		int min=0;
		for (int i = num;i>0 ;i/=10 )
		{
			int digit= i%10;
			if (max<digit)
			{
				max = digit;
			}
			else if (max>digit)
			{
				min = digit;
			}

		}
		System.out.println("Largest digit from "+num+ " is "+max);
		System.out.println("smallest digit from "+num+ " is "+min);

	}
}
