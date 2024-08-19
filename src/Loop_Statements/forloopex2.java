package Loop_Statements;

public class forloopex2 {
	public static void main(String args[])
	{
		int[] nums= {1,2,3,4,5};
		for(int num:nums)
		{
			System.out.println(num);
		}
		
		for(;;)
		{
			System.out.println("Forever loop");
		}
}
}
