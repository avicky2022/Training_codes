package oopsjava;

import oopsjava.private_example.Add;

public class default_example {
	public class check {
		   public static void main(String args[]){
			Add obj = new Add();
		        
			obj.addTwoNo(10, 21);
		   }
		}
	
	public class Add {
		   
		   int addTwoNo(int a, int b){
			return a+b;
		   }
		}

}
