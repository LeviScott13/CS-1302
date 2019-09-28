//*******************************************************************************
//Purpose:  Finding the discriminant and root values using quadratic equations
//			Also, learning how to create and update objects
//
//Names:    Levi Sutton
//
//Course:   CS1301
//
//Program:  MyQuadraticEquation1
//
//Date: 	August 17, 2017
//********************************************************************************

//Class
public class MyQuadraticEquation1
{
	private double a, b, c;
	private double d;

	//*****************************************************************************
	//	MyQuadraticEquation1(): No-Arguement constructor 
	//
	//*****************************************************************************
	public MyQuadraticEquation1()
	{
		a = 1;
		b = 1;
		c = 1;
	}
	//*****************************************************************************	
	//	MyQuadraticEquation1(arguments): Sets variables to local variables
	//
	//*****************************************************************************
	public MyQuadraticEquation1(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//*****************************************************************************
	//	getA():	Returns value of a
	//
	//*****************************************************************************
	public double getA()
	{
		return a;
	}
	//*****************************************************************************
	//	setA():	Sets the value of a (local variable)
	//
	//*****************************************************************************
	public void setA(double a)
	{
		this.a = a;
	}
	//*****************************************************************************
	//	getB():	Returns value of b
	//
	//*****************************************************************************
	public double getB()
	{
		return b;
	}
	//*****************************************************************************
	//	setB():	Sets the value of b (local variable)
	//
	//*****************************************************************************
	public void setB(double b)
	{
		this.b = b;
	}
	//*****************************************************************************
	//	getC():	Returns value of c
	//
	//*****************************************************************************
	public double getC()
	{
		return c;
	}
	//*****************************************************************************
	//	setC():	Sets the value of c (local variable)
	//
	//*****************************************************************************
	public void setC(double c)
	{
		this.c = c;
	}
	//*****************************************************************************
	//	getDiscriminant():	Returns discriminant value
	//
	//*****************************************************************************
	public double getDiscriminant()
	{
		d = b*b - 4*a*c;
		return d;
	}
	//*****************************************************************************
	//	getRoot1():	Returns the root value (if possible) and discriminant
	//				based on the quadratic equation
	//
	//*****************************************************************************
	public double getRoot1()
	{
		if (d < 0){
			return 0;
		}

		double discriminant = (-b + Math.sqrt(b*b - 4*a*c)) / (2 * a);

			return discriminant;

	}
	//*****************************************************************************
	//	getRoot2():	Returns the 2nd root value (if possible) and discriminant
	//				based on the quadratic equation
	//
	//*****************************************************************************
	public double getRoot2()
	{
		if (d < 0){
			return 0;
		}

		double discriminant = (-b - Math.sqrt(b*b - 4*a*c)) / (2 * a);

			return discriminant;
	}
}
