package operators;

public class Logical {

	public static void main(String[] args) {
		
		boolean a=true,b=true;
				a=true;b=false;
				a=false;b=true;
				a=false;b=false;
		System.out.println(a&&b); //true false false false
		System.out.println(a||b); //true true true false
		
		System.out.println(!a); //false false true true
		System.out.println(!(a&&b));  //false true true

	}

}
