class Census
{
	public static void main(String [] args)
	{
		long currPop=312032486;
		final long seconds= (365*24*60*60)*5;
		long birth=seconds/7;
		long death= seconds/13;
		long immigrants= seconds/45;

		long newPop= currPop+birth-death+immigrants;
		System.out.println("Current Population is: " + currPop);
		System.out.println("New Population is: " +newPop);
	}


}