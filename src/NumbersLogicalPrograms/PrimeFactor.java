package NumbersLogicalPrograms;

public class PrimeFactor {
	public static void main(String args[])
	{
		int n=20;
		System.out.println("Prime factor of the given number is :");
		while(n % 2 == 0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		for(int i=3;i*i<=n;i=i+2)
		{
			System.out.print(i+" ");
			n=n/i;
		}
		if(n > 2)
		{
			System.out.print(n+" ");
		}
	}
}
