import java.util.Scanner;
class PalidromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String: ");
		String str = sc.next();
		String rev="" ;
		for (int i=str.length()-1;i>=0 ;i-- )
		{
			rev = rev+ str.charAt(i);
		}
		if (str.equals(rev))
		{
			System.out.println("it is a palindorme");
		}
		else{
			System.out.println("it is not a palindrome");
		}
	}
}