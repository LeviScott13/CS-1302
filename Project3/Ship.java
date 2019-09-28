//*******************************************************************************
//Purpose:  Learning how to use inheritance to make new objects and invoke methods
//          from different classes
//			
//
//Names:    Levi Sutton
//
//Course:   CS1302
//
//Program:  MyShip3
//
//Date: 	   September 1, 2017
//********************************************************************************
public class Ship
{
   private String shipName;
   private String year;
   
   //*****************************************************************************
	//	Ship():No arguement constructor
	//
   //*****************************************************************************
   public Ship()
   {
   }
   //*****************************************************************************
	//	Ship(String shipName, String year): Constructor that assigns variables shipName 
   //                                     and year to store the ships name and year
	//
	//***************************************************************************** 
   public Ship(String shipName, String year)
   {
      this.shipName = shipName;
      this.year = year;
   }
   //*****************************************************************************
	//	getShipName(): Accessor that returns the ships name
	//
   //*****************************************************************************
   public String getShipName()
   {
      return shipName;
   }
   //*****************************************************************************
	//	setShipName(String shipName): Mutator that assigns the ships name
	//
	//*****************************************************************************
   public void setShipName(String shipName)
   {
      this.shipName = shipName;
   }
   //*****************************************************************************
	//	MyString2(String s): Method that converts String into the array buffer
	//
	//*****************************************************************************
   public String getYear()
   {
      return year;
   }
   //*****************************************************************************
	//	setYear(String year): Mutator that assigns the ships year
	//
	//*****************************************************************************
   public void setYear(String year)
   {
      this.year = year;
   }
   //*****************************************************************************
	//	String toString(): •	Returns the ships name and year
   //
	//*****************************************************************************
   public String toString()
   {
      return "Name of the ship is:        \t" + shipName + 
             "\nShip was built on:        \t" + year;
   }
}