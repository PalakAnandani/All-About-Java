import java.util.Scanner;
class RevString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string : ");
		String str= sc.next();
		String rev = "";
		for (int i =0;i<str.length() ;i++ )
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println(rev); //LOGIC 1

		System.out.println("==============================");
		
		String rev1="";
		for (int j=str.length()-1;j>=0 ;j-- )
		{
			rev1= rev1+str.charAt(j);
		}
		System.out.println(rev1); //LOGIC 2

		System.out.println("==============================");

		StringBuffer rev2 = new StringBuffer(str);
		System.out.println(rev2.reverse()); //LOGIC 3
	}
}