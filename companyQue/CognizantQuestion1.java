import java.util.Scanner;
class CognizantQuestion1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String str= "ibbibaiaai";
		int lenI=0;
		int lenA=0;
		int lenB=0;
		for (int i =0;i<=str.length() ; i++ )
		{
			if (str.charAt(i).equals('i'))
			{
				lenI++;
			}
			else if (str.charAt(i).equals('a'))
			{
				lenA++;
			}
			else if (str.charAt(i).equals('b'))
			{
				lenB++;
			}
		}
		System.out.println(lenI);
	}
}