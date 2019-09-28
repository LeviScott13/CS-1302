public class MyComplex7
{
   //Main Method
   public static void main (String[] args)
   {  
      //*************************************************************************************
      //Reads the command line inputted arguements and converts Strings to doubles by parsing    
      //*************************************************************************************
      double a = Double.parseDouble(args[0]);      
      double b = Double.parseDouble(args[1]);      
      double n1 = Double.parseDouble(args[2]);
      double n2 = Double.parseDouble(args[3]);
      //***********************************************************************************
      //Creates objects out of the class Complex to pass the arguements in the command line
      //***********************************************************************************
      Complex t = new Complex(a,b);
      Complex r = new Complex(n1,n2);
      Complex num = new Complex();
      
      String add =  t.toString() + " + " + r.toString();//passes values from the corresponding constructors to the objects and prints the result from toString method
      System.out.print(add);//Prints the String above
      num.addition(t,r);//Calls the addition method, the values passed, calculates the values, and prints the results 
      
      String sub = "\n" + t.toString() + " - " + r.toString();//passes values from the corresponding constructors to the objects and prints the result from toString method
      System.out.print(sub);//Prints the String above
      num.subtract(t,r);//Calls the subtraction method, the values passed, calculates the values, and prints the results 
      
      String mult = "\n" + t.toString() + " * " + r.toString();//passes values from the corresponding constructors to the objects and prints the result from toString method
      System.out.print(mult);//Prints the String above
      num.multiply(t,r);//Calls the multiplication method, the values passed, calculates the values, and prints the results 
      
      String div = "\n" + t.toString() + " / " + r.toString();//passes values from the corresponding constructors to the objects and prints the result from toString method
      System.out.print(div);//Prints the String above
      num.divide(t,r);//Calls the division method, the values passed, calculates the values, and prints the results 
     
      String av = "\n" + "|" + t.toString() + "|";//passes values from the corresponding constructors to the objects and prints the result from toString method
      System.out.print(av);//Prints the String above
      num.abs(t,r);//Calls the absolute value method, the values passed, calculates the values, and prints the results 
            
      Complex copyT = (Complex)t.clone();//calls the clone method and makes a copy of object t and "inherits" its methods
      Complex copyR = (Complex)r.clone();//calls the clone method and makes a copy of object r and "inherits" its methods
      System.out.println();//new line
      System.out.println("\n\t\tI Cloned Them!\n");
      
      System.out.print(copyT + " + " + copyR);//prints the copy information from object t and object r respectively
      copyT.addition(t,r);//Calls addition method and prints results like before
      System.out.println();
      
      System.out.print(copyT + " - " + copyR);//prints the copy information from object t and object r respectively
      copyT.subtract(t,r);//Calls subtraction method and prints results like before
      System.out.println();

      System.out.print(copyT + " * " + copyR);//prints the copy information from object t and object r respectively
      copyT.multiply(t,r);//Calls multiplication method and prints results like before
      System.out.println();

      System.out.print(copyT + " / " + copyR);//prints the copy information from object t and object r respectively
      copyT.divide(t,r);//Calls division method and prints results like before
      System.out.println();      
      
      System.out.print("|" + copyT + "|");//prints the copy information from object t and object r respectively
      copyT.abs(t,r);//Calls absolute method and prints results like before
   }
}