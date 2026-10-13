package operators;

public class Rel_Logical {

	public static void main(String[] args) {
	int a=22,b=33,c=44,d=55;
	
	System.out.println(a>=b && c<=d); //false
	System.out.println(a>=b || c<=d); //true
	
	System.out.println(!(a>=b && c<=d)); //true
	System.out.println(!(a>=b || c<=d)); //false
	}

}
