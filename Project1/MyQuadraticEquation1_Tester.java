//imports scanner
import java.util.Scanner;

public class MyQuadraticEquation1_Tester
{
	//Main method
	public static void main(String[] args)
	{
		//Invokes scanner object
		Scanner scan  = new Scanner(System.in);
		int a,b,c;
		// TODO Auto-generated method stub
		
		//Object 1 created from MyQuadraticEquation1
		MyQuadraticEquation1 mqe1 = new MyQuadraticEquation1();
		System.out.println("Original quadratic equation qe1:	" + mqe1.getA() + "X^2" + "+" + mqe1.getB() + "x" + mqe1.getC()); //Prints quadratic equation
		System.out.println("Discriminant				" 	+ "="      + mqe1.getDiscriminant()); //Prints Discriminant
		if(mqe1.getRoot1() == 0)
		{
			System.out.println("The equation has no real roots");
		}
		else
		{
			System.out.println("Root1 Value:"													   + "x1 =" + mqe1.getRoot1()); //Prints root 1 value
			System.out.println("Root2 Value:"													   + "x2 =" + mqe1.getRoot2()); //Prints root 2 value
		}
		//Prompts the user to enter values for variables a, b, c
		System.out.println("Enter the three coefficients:		");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		//Object 2 created from MyQuadraticEquation1
		MyQuadraticEquation1 mqe2 = new MyQuadraticEquation1(a, b, c);
		System.out.println("\n\nSecond quadratic equation qe2:		" + mqe2.getA() + "X^2" + "+" + mqe2.getB() + "x" + "+" + mqe2.getC()); //Prints quadratic equation
		System.out.println("Discriminant				" 	+ "="      + mqe2.getDiscriminant()); //Prints discriminant
		if(mqe2.getRoot1() == 0)
		{
			System.out.println("The equation has no real roots");
		}
		else{
			System.out.println("Root1 Value:				"		+ "x1 =" + mqe2.getRoot1()); //Prints root 1 value
			System.out.println("Root2 Value:				"		+ "x2 =" + mqe2.getRoot2()); //Prints root 2 value
		}

		System.out.println("\n\nUpdated first quadratic equation");
		mqe1.setA(1); //Updates variable a to 1
		mqe1.setB(2); //Updates variable b to 2
		mqe1.setC(1); //Updates variable c to 1
		System.out.println("Original quadratic equation qe1:	" + mqe1.getA() + "X^2" + "+" + mqe1.getB() + "x" + "+" + mqe1.getC()); //Prints quadratic equation
		System.out.println("Discriminant				" 	+ "="      + mqe1.getDiscriminant()); //Prints discriminant
		if(mqe1.getRoot1() == 0)
		{
			System.out.println("The equation has no real roots");
		}
		else
		{
			System.out.println("Root1 Value:				"													   + "x1 =" + mqe1.getRoot1()); //Prints root 1 value
			System.out.println("Root2 Value:				"													   + "x2 =" + mqe1.getRoot2()); //Prints root 2 value
		}
		System.out.println("\n\nUpdated first quadratic equation");
		mqe1.setA(1); //Updates variable a to 1
		mqe1.setB(2); //Updates variable b to 2
		mqe1.setC(3); //Updates varibale c to 3
		System.out.println("Original quadratic equation qe1:	" + mqe1.getA() + "X^2" + "+" + mqe1.getB() + "x" + "+" + mqe1.getC());
		System.out.println("Discriminant				" 	+ "="      + mqe1.getDiscriminant()); //Prints discriminant
		if(mqe1.getRoot1() == 0)
		{
			System.out.println("The equation has no real roots");
		}
		else
		{
			System.out.println("Root1 Value:				"													   + "x1 =" + mqe1.getRoot1()); //Prints root 1 value
			System.out.println("Root2 Value:				"													   + "x2 =" + mqe1.getRoot2()); //Prints root 2 value
		}
	}
}
