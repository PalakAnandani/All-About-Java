//in a hockey team, if 7 players of one team are standing consicutive, it is considered as danger, (print yes) else print no
// 1- for team a and 0- for team b
import java.util.Scanner;
class EyHockeyPlayers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the sequence of players: ");
		String str= sc.next();
		boolean flag= true;
		for (int i=str;i>0;i/=10)
		{
			int rem = i%10;
			if (flag=false )
			{
				System.out.println("yes");
				break;
			}
			else if (flag)
			{
				System.out.println("no");
        	}
		}
	}
}