class MultiCatchEx1
{
	public static void main (String args [])
	{
		try
		{
			int a=args.length;
			System.out.println("a="+a);
			int b=50/a;
			int c[]={1};
			c[42]=10;
		}
		catch (ArithmeticException e)
		{
			System.out.println ("Division by zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println (" Array index out of bound");
		}
	}
}