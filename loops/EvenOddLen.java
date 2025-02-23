import java.util.Scanner;
class EvenOddLen 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup=num;
		int count=0;
		/*loop to get the count of digit every iter we remove a digit 
		and we do the task until num is not zero and every cnt is incre by 1*/
		while (num>0) // loop iter till num is not zero
		{
			count++; //incre the cnt by one in every iter
			num/=10; //everytime we update the num and at last num becomes zero
		} 
		String newNum=""; //newNum is intialized empty (no char)
		if (count %2==0)// if the len is even
		{
			for (int i=dup ;i>0 ;i/=10 )
			{
				int rem = i%10;
				if (rem%2!=0){
					newNum= ++rem + newNum;
				}else{
					newNum= rem+ newNum;
				}

			}
		}
		else // when the length is odd
		{
			for (int i=dup;i>0 ;i/=10 )
			{
				int rem =i%10;
				if (rem%2==0)
				{
					newNum= ++rem + newNum;
				}else{
					newNum= rem + newNum;
				}
			}
		}
		System.out.println(dup+ " : "+newNum);
	}
}
