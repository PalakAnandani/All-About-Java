import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int nnum=num+1;
		boolean flag= false;
		for (int i=1;i<=nnum ;i++ )
		{
			if (i*i==nnum)
			{
				flag=true;
				//System.out.println(num+ " is a sunny number ");
				break;
			}
		}
		if (flag)
		{
			System.out.println(num+" is a sunny number ");
		}
		else{
			System.out.println(num+" is not a sunny number");
		}
	}
}