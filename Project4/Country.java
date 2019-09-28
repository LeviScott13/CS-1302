/*************************************************************************
 *Purpose:     Using ArrayList to sort through and display Countries and continents
 *
 *Author:      Levi Sutton
 *
 *Course:      <1302>
 *
 *Date:        <09/19/17>  
 *************************************************************************   
 */
public class Country{
   private String countryName;
   private String continentName;
   private long continentPopulation;
   private long continentArea;
   private long countryPopulation;
   private long countryArea;
   
   //Set new variable using this.
   public Country(String countryName, String continentName, long countryPopulation, long countryArea){
      
      this.countryName = countryName;
      this.continentName = continentName;
      this.countryPopulation = countryPopulation;
      this.countryArea = countryArea;
   }
   //Method to get Country name
   public String getCountryName(){
      
      return countryName; // update
   }
   // Method to get population
   public long getCountryPopulation(){
      
      return countryPopulation; // update
   }
   // Method to get Country area
   public long getCountryArea(){
     
      return countryArea; // update
   }
      //String method to get Continent name 
      public String getContinentName(){
      return continentName;
   } 
   //To String Method for print statements
   public String toString(){
      String result = "\n\tCountry Name:       \t" + countryName +
                      "\n\tContinent Name:     \t" + continentName +
                      "\n\tCountry Population: \t" + countryPopulation +
                      "\n\tCountry Area:       \t" + countryArea; 
      return result;
   }
}
 