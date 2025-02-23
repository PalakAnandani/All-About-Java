class ConOperExample
{
	public static void main( String [] args)
	{  //for 2 numbers
		int p=10;
		int q=20;
		int largest=(p>q)?(p):(q);
		System.out.println("largest num: "+largest);

		//for 3 numbers
		int a=22;
		int b= 4;
		int c=1;
		int small=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(small);
	}
}