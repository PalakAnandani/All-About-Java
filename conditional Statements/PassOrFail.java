import java.util.Scanner;
 class PassOrFail
 {

	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("enter your marks:");
		int marks=sc.nextInt();
		final int tMarks=600;
		float total=(marks*100)/tMarks;
		String op=(total>=75)?"A with "+total+"%":
			(total>=60)?"B with "+total+"%":
			(total>=35)? "C with" + total + "%": "Failed";
		System.out.println(op);
	}
}