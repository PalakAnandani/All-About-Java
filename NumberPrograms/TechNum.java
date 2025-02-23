class TechNum 
{
	public static void main(String[] args) 
	{
		int num = 2025 , len=0 , div=1;
		for (int i =num; i>0 ;i/=10 ){
			len++;
			//System.out.println(len);
		}
		if (len%2==0)
		{
			for (int i=1 ;i<= (len/2) ;i++ )
				div*=10;
			int sum=(num/div)+(num%div);
			//       firstHalf+secHalf of num
			//System.out.println(sum);
			int sqr = sum*sum;
			System.out.println(sqr==num? num+" is a TECH number": num+"is not a TECH number");
		}
	}
}
