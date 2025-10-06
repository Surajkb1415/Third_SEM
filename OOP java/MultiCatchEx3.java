import java.util.Scanner;
public class MultiCatchEx3
{
	public static void main(String[] args) 
	{ 
		 int x, y;
		 Scanner sc = new Scanner(System.in); 
		try 
		{	 
			 System.out.println("Enter your first number"); 
			 x = sc.nextInt(); 
			 System.out.println("Enter your second number"); 
 			y = sc.nextInt(); 
			int z = x / y; 
			System.out.println("z = " +z); 
		} 
		catch(Exception e) 
		{	 
 			 System.out.println("Generic Exception Catch"+e); 
		}  
		System.out.println("Out of try-catch block"); 
 	} 
}