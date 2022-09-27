package pack1;

public class Static {
	String empname;
	double empid;
	double sal;  
	String designation;
	static String clgname="cvn";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static e1=new Static();
		e1.enter("Aravind", 13135, 35000, "Trainee software eng");
		e1.display();
		Static e2=new Static();
		e2.enter("Shiva", 13136, 45000, "Software eng");
		e2.display();
		Static e3=new Static();
		e3.enter("Ram", 13137, 55000, "Senior software eng");
		e3.display();
		

	}
	void enter(String a,double b,double c,String d)
	{
		empname=a;
		empid=b;
		sal=c;
		designation=d;
				
	}
	void display()
	{
		System.out.println("Employee name :"+empname);
		System.out.println("Emp id        :"+empid);
		System.out.println("Salary        :"+sal);
		System.out.println("Designation   :"+designation);
		System.out.println("college name  :"+clgname);
		System.out.println("-----------------------------------");
	}

}

