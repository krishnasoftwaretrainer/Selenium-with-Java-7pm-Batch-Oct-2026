package arrays_strings;

public class StringMethods {

	public static void main(String[] args) {
		
		//= == equals
		String str1="Krishna"; //Literal
		String str2="Rames"; //Pool
		
		String str4=new String("Ramesh");
	    String str5=new String("Krishna");
	    //== compares the memory location 
	    
//	    System.out.println(str1==str2);//false
//	    System.out.println(str4==str5);//false
//	    
//	    System.out.println(str1.equals(str2)); //false
//	    System.out.println(str4.equals(str5)); //false
//	    
	    String str6="Mahesh Babu";
	    String str7="Ramesh Babu";
	    System.out.println(str6==str7);
	    System.out.println(str6.equals(str7));//Case Senstive
	    System.out.println(str6.equalsIgnoreCase(str7));
	    System.out.println(str6.contains("Babu")); //Partial String
	    
//	    String s1="Java";  //FB KRishna 
//	    s1="Core Java";
//	    //s1.concat("CoreJava");
//	    System.out.println(s1); 
//		
		//String Length()
		/*
		String str1="Hello World!";
		System.out.println(str1.length());
		
		//String Uppercase and Lowercase
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//String Replace
		String str2="Corw Java";
		System.out.println(str2);
		System.out.println(str2.replace('w', 'e'));
		System.out.println(str2.replace("Corw", "Selenium"));
	
		//string Trim()
		String str3="  Core Java  ";
		System.out.println(str3);
		System.out.println(str3.trim());
	
		//String Concat
		String str4=" Selenium";
		String str5=" with Java";
		System.out.println(str4.concat(str5));
		System.out.println(str5.concat(str4));
		
		System.out.println(str4);
		System.out.println(str5);
	
		//String Empty()
		String str6="";
		System.out.println(str6.isEmpty()); */
	}

}
