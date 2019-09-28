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
public class CargoShip extends Ship
{
   private int tonnage;
   //*****************************************************************************
	//	CargoShip():No arguement constructor
	//
   //*****************************************************************************
   public CargoShip()
   {
      
   } 
   //*****************************************************************************
	//	CargoShip(String shipName, String year): Constructor that assigns the tonnage,
   //                                          ships name, and ships year
	//
	//*****************************************************************************
   public CargoShip (int tonnage, String name, String year)
   {
      super(name, year);
      this.tonnage = tonnage;
   }
   //*****************************************************************************
	//	getTonnage(): Accessor that returns the tonnage capacity
	//
   //*****************************************************************************
   public int getTonnage()
   {
      return tonnage;
   }
   //*****************************************************************************
	//	setTonnage(int tonnage): Mutator that assigns the tonnage capacity of the ship 
   //
	//*****************************************************************************
   public void setTonnage(int tonnage)
   {
      this.tonnage = tonnage;
   }
   //*****************************************************************************
	//	String toString(): Returns the tonnage capacity of the ship, ships name, 
   //                    and year
   //
	//*****************************************************************************
   public String toString()
   {
      return "\nName of the Cruise Ship is:  \t" + super.getShipName() + 
             "\nTonnage Capacity:            \t" + getTonnage() + 
             "\nYear ship was built:         \t" + getYear();                  
   }
}