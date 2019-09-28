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
import java.util.ArrayList;

public class MyShip3
{
   //*****************************************************************************
	//	main(String[] args) : Strings arguements to create new objects and establish
   //                       a for loop to store ship objects in an array
	//
   //*****************************************************************************   
   public static void main(String[] args) 
   {

      ArrayList <Ship> ss = new ArrayList<>();
      int maxPassengers = 0;
      int tonnage = 0;
   
      ss.add(new CruiseShip(2786, "Leviathan","1994"));
      ss.add(new CruiseShip(8376,"Titanic","1912"));
      ss.add(new CargoShip(173748, "Moby","1932"));
      ss.add(new CargoShip(399478,"Lucy","2030"));
   
      for (int i = 0; i < ss.size(); i++)
      {
         Ship wave = ss.get(i);
         System.out.println (ss.get(i));
         if (wave instanceof CruiseShip)
             maxPassengers += ((CruiseShip)wave).getMaxPassengers();
         else if (wave instanceof CargoShip)
            tonnage += ((CargoShip)wave).getTonnage();
      }
   }
}

   
