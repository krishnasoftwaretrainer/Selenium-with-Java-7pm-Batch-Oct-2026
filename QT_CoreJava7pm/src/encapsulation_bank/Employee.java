package encapsulation_bank;

public class Employee 
{
	public static void main(String[] args) {
		Customer1 cus=new Customer1();
//		System.out.println(cus.accno);
//		System.out.println(cus.accname);
//		System.out.println(cus.balanace);
		
		cus.setbalance(2563.234);
		System.out.println(cus.getaccnum());
		System.out.println(cus.getaccname());
		System.out.println(cus.getbalance());
		

	}

}
