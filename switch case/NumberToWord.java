import java.util.Scanner;
class NumberToWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num1 = sc.nextInt();
		String word1="";
		for (int i=num1;i>0 ;i/=10 )
		{
			int rem = i %10;
			switch(rem){
				case 0 :word1 = "Zero "+word1;break;
				case 1 :word1 = "one "+word1;break;
				case 2 :word1 = "two "+word1;break;
				case 3 :word1 = "three "+word1; break;
				case 4 :word1 = "four "+word1; break;
				case 5 :word1 = "five "+word1 ;break;
				case 6 :word1 = "six "+word1 ; break;
				case 7 :word1 = "seven "+word1; break;
				case 8 :word1 = "eight "+word1; break;
				case 9 :word1 = "nine "+word1; break;
			}
		}
		System.out.println(num1);
		System.out.println(word1);//backword loop logic
 
	}
}
// reverse a number &leetcode .
// check whether the entered number is palindrome or not.
// reverse a string.
// palindrome string.
// convert number into word .
// find prime factors of a number ->20 - 2,5.
// convert the number from even to odd or vice versa according to the length 1234 -> (length is 4 so convert it to even) which is 2244
// tempreture converter from degree to cel,fah,rankine 