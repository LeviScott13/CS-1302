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
public class CruiseShip extends Ship
{
   private int maxPassengers;
   //*****************************************************************************
	//	CruiseShip():No arguement constructor
	//
   //*****************************************************************************
   public CruiseShip()
   {
      
   } 
   //*****************************************************************************
	//	CruiseShip(String shipName, String year): Constructor that assigns the maximum 
   //                                           number of passengers, ships name, and 
   //                                           ships year
	//
	//*****************************************************************************
   public CruiseShip (int maxPassengers, String name, String year)
   {
      super(name, year);
      this.maxPassengers = maxPassengers;
   }
   //*****************************************************************************
	//	getMaxPassengers(): Accessor that returns the maximum number of passengers
	//
   //*****************************************************************************
   public int getMaxPassengers()
   {
      return maxPassengers;
   }
   //*****************************************************************************
	//	setMaxPassengers(int maxPassengers): Mutator that assigns the maximum number 
   //                                      passenges on the ship
   //
	//*****************************************************************************
   public void setMaxPassengers(int maxPassengers)
   {
      this.maxPassengers = maxPassengers;
   }
   //*****************************************************************************
	//	String toString(): Returns the maxiumum number of passengers, ships name, 
   //                    and year
   //
	//*****************************************************************************
   public String toString()
   {
      return "\nName of the Cruise Ship is:  \t" + super.getShipName() + 
             "\nMaximum number of Passengers:\t" + getMaxPassengers() + 
             "\nYear ship was built:         \t" + getYear();
                                   
   }
}