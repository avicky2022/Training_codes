package oopsjava;

public class protected_example {
	
	class Test extends Add{
		   public static void main(String args[]){
			Test obj = new Test();
			System.out.println(obj.addTwoNo(11, 22));
		   }
		}
	
	public class Add {

		   protected int addTwoN0(int a, int b){
			return a+b;
		   }
		}

}
