package pack1;


public class Main_function {

void main() {

    int n=23; 
    int m=17;
    System.out.println(n+m);
}

void main() {

    System.out.println("When was I called?");
}

public static void main(String[] args) {
	Main_function abc = new Main_function();
	abc.main();
	abc.main();
}

}