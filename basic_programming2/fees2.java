class fees
{
	public static void main(String args[])
	{
		int fees=125000;
		int d_p=10;
		int d_a=fees/d_p;
		System.out.println("discounted fees if"+d_a);
		int d_f=fees-d_a;
		System.out.println("fees to pay"+d_f);
	}
}