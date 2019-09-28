//*********************************************************************************************************
//Purpose:  Learning how to manipulate real and imaginary numbers and how to impplement the cloneable method 
//
//Author:   Levi Sutton
//
//Course:   1302
//
//Date:     10/13/2017
//**********************************************************************************************************
import java.util.*;

//Class implements Cloneable method
public class Complex implements Cloneable
{ 
   //Declerations
   double a;
   double b;
   //*************************************************
   //Override cloneable/Cloneable method implmentation
   //*************************************************
   @Override
   public Object clone()
   {
      try
      {
         return super.clone();
      }
      catch (Exception e)
      {
         System.out.print(e);
         return null;
      }
   }
   //*********************************************
   //No-arguement constructor assigns a and b to 0
   //*********************************************
   public Complex()
   {
      a = 0;
      b = 0;
   }
   //****************************************
   //Accepts one arguement and assigns b to 0
   //****************************************
   public Complex(double a)
   {
      this.a = a;
      b = 0;
   }
   //*****************************************************************
   //Accepts 2 arguements and references a and b to the object Complex
   //*****************************************************************
   public Complex(double a, double b)
   {
      this.a = a;
      this.b = b;
   }
   //************************************************************
   //Returns the real number part of the complex numbers equation
   //************************************************************
   public double getRealPart()
   {
      return a;
   }
   //*********************************************************
   //Returns the imaginary part of the complex number equation
   //*********************************************************
   public double getImaginaryPart()
   {
      return b;
   }
   //*************************************************************************************************
   //Method to calculate addition between the real and imaginary parts in the complex numbers equation
   //*************************************************************************************************
   public void addition(Complex n1, Complex n2)
   {
      String result = " ";
      result += "= " + ((n1.getRealPart() + n2.getRealPart()) + " + " + (n1.getImaginaryPart() + n2.getImaginaryPart()) + "i");
      System.out.print(result);
   }
   //****************************************************************************************************
   //Method to calculate subtraction between the real and imaginary parts in the complex numbers equation
   //****************************************************************************************************
   public void subtract(Complex n1, Complex n2)
   {
      String result = " ";
      result += "= " + ((n1.getRealPart() - n2.getRealPart()) + " + " + (n1.getImaginaryPart() - n2.getImaginaryPart()) + "i");
      System.out.print(result);
   }
   //*******************************************************************************************************
   //Method to calculate multiplication between the real and imaginary parts in the complex numbers equation
   //*******************************************************************************************************
   public void multiply(Complex n1, Complex n2)
   {
      String result = " ";
      double m1 = n1.getRealPart() * n2.getRealPart() - n1.getImaginaryPart() * n2.getImaginaryPart();
      double m2 = n1.getImaginaryPart() * n2.getRealPart() + n1.getRealPart() * n2.getImaginaryPart();
      result += String.format("= %.2f + %.2fi", m1, m2);
      System.out.print(result);
   }
   //*************************************************************************************************
   //Method to calculate division between the real and imaginary parts in the complex numbers equation
   //*************************************************************************************************
   public void divide(Complex n1, Complex n2)
   {
      String result = " ";
      double d1 = n1.getRealPart() * n2.getRealPart() + n1.getImaginaryPart() * n2.getImaginaryPart();
      double d2 = (Math.pow(n2.getRealPart(),2) + Math.pow(n2.getImaginaryPart(),2));
      double d3 = n1.getImaginaryPart() * n2.getRealPart() - n1.getRealPart() * n2.getImaginaryPart();
      double d4 = (Math.pow(n2.getRealPart(),2) + Math.pow(n2.getImaginaryPart(),2));
      result += String.format("= %.2f + %.2fi", (d1/d2),(d3/d4));
      System.out.print(result);
   }
   //*******************************************************************************************************
   //Method to calculate absolute value between the real and imaginary parts in the complex numbers equation
   //*******************************************************************************************************
   public void abs(Complex n1, Complex n2)
   {
      String result = " ";
      double value = Math.sqrt(Math.pow(n1.getRealPart(),2) + Math.pow(n1.getImaginaryPart(),2));
      result += String.format("= %.2f", value);
      System.out.print(result);
   }
   //************************************************************
   //toString method that returns the results of our calculations
   //************************************************************
   public String toString()
   {
      
      String result = "(" + String.format("%.2f",a) + " + " + String.format("%.2f",b) + "i)";
                      
      return result;
   }
}