class SumOfDigits
{
	public static void main(String args[])
	{
		int n,r,s;
		n=Integer.parseInt(args[0]);
		s=0;
		while(n!=0)
		{
			
			r=n%10;
			s=s+r;
			n=n/10;
			
		}
		System.out.println("Sum of Digits:" +s);
	}
}