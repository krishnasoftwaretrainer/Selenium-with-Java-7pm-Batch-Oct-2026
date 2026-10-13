package operators;

public class Assignment {

	public static void main(String[] args) {

		int a=10,b=10,c=10,d=10;
		/*
		System.out.println(a+=5);//a=a+5;15
		System.out.println(b-=5);//5
		System.out.println(c*=5);//50
		System.out.println(d/=5);//2
		*/
		
		a=15;
		System.out.println(a);// 15
		System.out.println(a+=5);//a=a+5;15 20
		System.out.println(a-=5);//5 15
		System.out.println(a*=5);//50 75
		System.out.println(a);  //50 75
		System.out.println(a/=5);//10 15
		System.out.println(a);//10    15
	}

}
