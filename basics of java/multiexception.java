package oopsjava;

public class multiexception {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[6];
		try
		{
          x[7]=54/0; I
		}
		
		catch(ArithmeticException e)
		{
	     	System.out.println("Exception code");

		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("unException code");
		}

}
}