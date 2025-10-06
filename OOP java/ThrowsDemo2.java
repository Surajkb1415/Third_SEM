import java.io.*;
class Example_Throw
{ 
    //declare exception using throws in the method signature
    void testMethod(int num) throws IOException
   { 
     if(num==1)
        throw new IOException("IOException Occurred in Method");
     else
        throw new ArithmeticException("ArithmeticException in Method");
   } 
}

class ThrowsDemo2
{ 
  public static void main(String args[])
{ 
   try
  { 
      //this try block calls the above method so handle the exception
     Example_Throw obj=new Example_Throw(); 
     obj.testMethod(10); 
   }
   catch(IOException ex)
   {
     System.out.println("Exception Caught:"+ex);
    } 
  }
}