class CountFreqOfNum 
{
	public static void main(String[] args) 
	{
		long num =12312312345l;
		System.out.println(num);
		for (int i=0;i<=9 ;i++ )
		{
			int cnt=0;
			for (long j=num; j>0 ;j/=10 )
			{
				long rem = j%10;
				if (i==rem)
				{
					cnt ++;
				}
			}
			if (cnt !=0)
			{
				System.out.println(i+ " : "+cnt);
			}
		}
	}
}
//convert a number to eve odd based on its length
//find the highest digit from a number
//find the smallest digit from a number
//otp generation program
//freq of digits in number
//find the highest repeating digit in a number
//find the least repeating digit in a number