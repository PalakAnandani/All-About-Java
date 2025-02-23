class SumOfEveOdd
{
	public static void main(String []args)
	{
		int num=1234;
		int evenSum=0;
		int oddSum=0;
		int rem =num%10; //4
		int temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		num=num/10; //3
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		num=num/10; //2
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
