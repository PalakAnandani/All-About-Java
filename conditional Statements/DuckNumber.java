import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		String str= sc.next();
		boolean flag= true;
		int count=0;
		if (str.charAt(0)=='0')
		{
			flag = false;
			//System.out.println(str+ " is not a duck number ");
		}
		for (int i =0;i<str.length() ;i++ )
		{
			if (str.charAt(i)=='0')
			{
				count++;
				break;
			}
		}
		if (count!=1)
		{
			flag = false;
		}
		if (flag)
		{
			System.out.println(str+" is a duck number");
		}
		else{
			System.out.println(str+" is not a duck number");
		}
	}
}
