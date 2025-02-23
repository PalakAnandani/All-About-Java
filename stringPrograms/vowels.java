import java.util.Scanner;
class Vowels
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the character:");
		char ch= sc.next().charAt(0);
		String op=((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+" is a vowel"):(ch+" is a consonant"));
		System.out.println(op);
	}
}