package pack1;

class MethodOverloading {

    
    private static void add(int a,int b){
    	int c;
    	c=a+b;
        System.out.println(c);
    }

    
    private static void add(int a,float b){
    	float c;
    	c=a+b;
        System.out.println(c);
    }
    
    private static void add(float a,float b){
    	float c;
    	c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
       add(2,3);
       add(1.3,2.3);
       add(2,2.3) 
    }
}