class HighestRepeatingDigitNum 
{
	public static void main(String[] args) 
	{
		long num=23456532789l;
		System.out.println(num);
		int digit = 0;
		int max=0;
		for (int i=0;i<9 ;i++ )
		{
			int count=0;
			for (long j=num;j>0 ;j/=10 )
			{
				long rem = j%10;
				if (i==rem)
				{
					count++;
				}
			}
			if (count!=0)
			{
				if (max<count)
				{
					max = count;
					digit= i;
				}
			}
		}
		System.out.println("highest repeating number digit is " +digit+" with the frequency of " +max);
	}
}
 