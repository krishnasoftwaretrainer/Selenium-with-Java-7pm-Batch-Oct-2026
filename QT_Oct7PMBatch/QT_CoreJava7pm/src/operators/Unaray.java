package operators;

public class Unaray {

	public static void main(String[] args) {
		int a=5,b=5,c=5,d=5;
		/*
		System.out.println(++a); //a=6
		System.out.println("a:"+a); //a=6
		
		System.out.println(b++);//b=5
		System.out.println("b:"+b);//b=6
		
		System.out.println(--c); //c=4
		System.out.println("c:"+c); //c=4
		
		System.out.println(d--);//d=5
		System.out.println("d:"+d);//d=4
		*/
		a=5;
		System.out.println(++a);   //a=6
		System.out.println("a:"+a); //a=6
		
		System.out.println(a++);//a=6 
		System.out.println("a:"+a);//a=6 7
		
		System.out.println(--a); //a=5  6
		System.out.println("a:"+a); //a=5 6
		
		System.out.println(a--);//a=5  6
		System.out.println("a:"+a);//a=4 5
		
		
		
//		System.out.println(a++); //6
//		System.out.println("a:"+a);
//		System.out.println(b--); //4
//		System.out.println("b:"+b);
	}

}
