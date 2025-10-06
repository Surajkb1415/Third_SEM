class ThrowDemo1
 {
           static void checkAge(int age) 
           {
	try{
	if (age < 18) 
	{
      		throw new ArithmeticException("Access denied - < 18 years old.");
    	}
   	else 
	{
		      System.out.println("Access granted - You are old enough!");
    	}
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception Caught;"+e);	
	}
	
         }

          public static void main(String[] args) 
         {
                     checkAge(15); // Set age to 15 (which is below 18...)
          }
}