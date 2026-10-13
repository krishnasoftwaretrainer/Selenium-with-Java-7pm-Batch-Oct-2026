package controlflow;

public class Jumping {

	public static void main(String[] args) 
	{
		//break;
		//continue;
		for(int i=1;i<=10;i++)//1<=10;
		{
			if(i==5 && i==5) //1==5F 2==5F 5==5T 6==5F
			{
				break; //Stop
				//continue;
			}
			System.out.println(i); //1 2 3 4 6 7 8 9 10
		}
	}
//break cannot be used outside of a loop or a switch
	//continue cannot be used outside of a loop	
}
