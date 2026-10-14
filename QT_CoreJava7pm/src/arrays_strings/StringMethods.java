package arrays_strings;

public class StringMethods {

	public static void main(String[] args) {
		//= == equals
		String str1="Krishna"; //Literal
		String str2="Rames"; //Pool
		
		String str4=new String("Ramesh");
	    String str5=new String("Krishna");
	    //== compares the memory location 
	    
	    System.out.println(str1==str2);//false
	    System.out.println(str4==str5);//false
	    
	    System.out.println(str1.equals(str2)); //false
	    System.out.println(str4.equals(str5)); //false
	    
	    String str6="Mahesh";
	    String str7="mahesh";
	    System.out.println(str6==str7);
	    System.out.println(str6.equals(str7));//Case Senstive
	    System.out.println(str6.equalsIgnoreCase(str7));
	    
	    String s1="Java";
	    s1="Core Java";
	    //s1.concat("CoreJava");
	    System.out.println(s1);
	}

}
