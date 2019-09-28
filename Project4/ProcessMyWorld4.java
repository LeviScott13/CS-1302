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
import java.util.*;
import java.io.*;

//Class with varibles set to zero
public class ProcessMyWorld4
{
    private Scanner fileReader;
    private ArrayList <Country> list = new ArrayList<>();
    String continent = "null";
    long pop = 0;
    long area = 0;
    long total = 0;
    long sa = 0;
    long ca = 0;
    long asia = 0;
    long euro = 0;
    long africa = 0;
    long ameri = 0;
    long ant = 0;
    long ausi = 0;
    long na = 0;
    long ocean = 0;
    long saPop = 0;
    long caPop = 0;
    long asiaPop = 0;
    long euroPop = 0;
    long africaPop = 0;
    long ameriPop = 0;
    long antPop = 0;
    long ausiPop = 0;
    long naPop = 0;
    long oceanPop = 0;
    
    //Constructor for objects of class ProcessMyWorld   
    public ProcessMyWorld4(String filename) throws IOException
    {
        fileReader = new Scanner(new File(filename));
      
        fileReader.nextLine(); //skip header
        while(fileReader.hasNextLine()) 
        {
            String line = fileReader.nextLine();
            String[] fields = line.split(",");   
            long pop = Long.parseLong(fields[2]);
            long area = Long.parseLong(fields[3]);
            
            Country c = new Country (fields[0], fields[1], pop, area);
            list.add(c);

        }
    }
    
    //Method with for loop to get get population for country
    public void displayMostPopulatedCountry()
    {    
         Country mostP = new Country ("","",0,0);
          
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            if(c.getCountryPopulation() > pop)  
            {
               pop = c.getCountryPopulation();
               mostP = c;
            }
         }  
   
         System.out.println ("The most populated country is" + " " + mostP.getCountryName() + "\t" + mostP.getCountryPopulation() + " people");

    }
    
    //Method with for loop to get largest country
    public void displayLargestCountry()
    {
         Country largest = new Country ("","",0,0);
          
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            if(c.getCountryArea() > area)  
            {
               area = c.getCountryArea();
               largest = c;
            }
         }  
   
         System.out.println ("The largest country is" + " " + largest.getCountryName() + "\t\t" + largest.getCountryArea() + " Square km");

    }
    
    //Method with for loop to print country pop
    public void displayWorldPopulation()
    {
          
         Country world = new Country ("","",0,0);
          
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            total += c.getCountryPopulation();
         }
         System.out.println ("The total world population is" + "\t\t" + total + " people");

    }
    
    //Method with for loop and switch statment to get area
    public void displayContinentArea()
    {
 
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            String continent = c.getContinentName();
            switch (continent)
            {        
               case "South America":      sa += c.getCountryArea();
                                          break;
               case "Central America":    ca += c.getCountryArea();
                                          break;
               case "Asia":               asia += c.getCountryArea();
                                          break;
               case "Europe":             euro += c.getCountryArea();
                                          break;
               case "Africa":             africa += c.getCountryArea();
                                          break;
               case "America":            ameri += c.getCountryArea();
                                          break;
               case "Antarctica":          ant += c.getCountryArea();
                                          break;
               case "Australia":          ausi += c.getCountryArea();
                                          break;                                  
               case "North America":      na += c.getCountryArea();
                                          break;
               case "Oceania":            ocean += c.getCountryArea();
                                          break;
            }                                       
         }
         
         //Print continents
         System.out.printf("%20s%20s","Continent Name", "Continent Area");
         System.out.println();
         System.out.printf("%20s%,20d","South America", sa);
         System.out.println();
         System.out.printf("%20s%,20d","Central America", ca);
         System.out.println();
         System.out.printf("%20s%,20d","Asia", asia);
         System.out.println();
         System.out.printf("%20s%,20d","Europe", euro);
         System.out.println();
         System.out.printf("%20s%,20d","Africa", africa);
         System.out.println();
         System.out.printf("%20s%,20d","America", ameri);
         System.out.println();
         System.out.printf("%20s%,20d","Antarctica", ant);
         System.out.println();
         System.out.printf("%20s%,20d","Australia", ausi);
         System.out.println();
         System.out.printf("%20s%,20d","North America", na);
         System.out.println();
         System.out.printf("%20s%,20d","Oceania", ocean);
         System.out.println();
    }
    
    //Method with for loop and switch to display population for continent
    public void displayContinentPopulation()
    {
                
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            String continent = c.getContinentName();
            switch (continent)
            {        
               case "South America":      saPop += c.getCountryPopulation();
                                          break;
               case "Central America":    caPop += c.getCountryPopulation();
                                          break;
               case "Asia":               asiaPop += c.getCountryPopulation();
                                          break;
               case "Europe":             euroPop += c.getCountryPopulation();
                                          break;
               case "Africa":             africaPop += c.getCountryPopulation();
                                          break;
               case "America":            ameriPop += c.getCountryPopulation();
                                          break;
               case "Antarctica":          antPop += c.getCountryPopulation();
                                          break;
               case "Australia":          ausiPop += c.getCountryPopulation();
                                          break;                                  
               case "North America":      naPop += c.getCountryPopulation();
                                          break;
               case "Oceania":            oceanPop += c.getCountryPopulation();
                                          break;
            }                                       
         }
         
         //Print continent populations
         System.out.println();        
         System.out.printf("%20s%25s","Continent Name", "Continent Population");
         System.out.println();
         System.out.printf("%20s%,20d","South America", saPop);
         System.out.println();
         System.out.printf("%20s%,20d","Central America", caPop);
         System.out.println();
         System.out.printf("%20s%,20d","Asia", asiaPop);
         System.out.println();
         System.out.printf("%20s%,20d","Europe", euroPop);
         System.out.println();
         System.out.printf("%20s%,20d","Africa", africaPop);
         System.out.println();
         System.out.printf("%20s%,20d","America", ameriPop);
         System.out.println();
         System.out.printf("%20s%,20d","Antarctica", antPop);
         System.out.println();
         System.out.printf("%20s%,20d","Australia", ausiPop);
         System.out.println();
         System.out.printf("%20s%,20d","North America", naPop);
         System.out.println();
         System.out.printf("%20s%,20d","Oceania", oceanPop);
         System.out.println();
    }
    
    ////Method with for loop, varibles set to zero, and switch
    //to find largest continent
    public void displayLargestContinent()
    {
         long sa3 = 0;
         long ca3 = 0;
         long asia3 = 0;
         long euro3 = 0;
         long africa3 = 0;
         long ameri3 = 0;
         long ant3 = 0;
         long ausi3 = 0;
         long na3 = 0;
         long ocean3 = 0;
         long max = 0;    
         
         Country big = new Country ("","",0,0);       
         
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            String continent = c.getContinentName();
            switch (continent)
            {        
               case "South America":      
                                          sa3 += c.getCountryArea();
                                          if(sa3 > max)
                                          {
                                             max = sa3;
                                             big = c;
                                          }
                                          break;
               case "Central America":    ca3 += c.getCountryArea();
                                          if(ca3 > max)
                                          {
                                             max = ca3;
                                             big = c;
                                          }
                                          break;
               case "Asia":               asia3 += c.getCountryArea();             
                                          if(asia3 > max)
                                          {
                                             max = asia3;
                                             big = c;
                                          }                                          
                                          break;
               case "Europe":             euro3 += c.getCountryArea();
                                          if(euro3 > max)
                                          { 
                                             max = euro3;
                                             big = c;
                                          }
                                          break;
               case "Africa":             africa3 += c.getCountryArea();
                                          if(africa3 > max)
                                          {
                                             max = africa3;
                                             big = c;
                                          }                                         
                                          break;
               case "America":            ameri3 += c.getCountryArea();
                                          if(ameri3 > max)
                                          {
                                             
                                             max = ameri3;
                                             big = c;
                                          }                                          
                                          break;
               case "Antarctica":         ant3 += c.getCountryArea();
                                          if(ant3 > max)
                                          {
                                             max = ant3;
                                             big = c;
                                          }                                          
                                          break;
               case "Australia":         ausi3 += c.getCountryArea();
                                         if(ausi3 > max)
                                          {
                                             max = ausi3;
                                             big = c;
                                          }                                          
                                          break;                                  
               case "North America":      na3 += c.getCountryArea();
                                          if(na3 > max)
                                          {
                                             max = na3;
                                             big = c;
                                          }                                         
                                          break;
               case "Oceania":            ocean3 += c.getCountryArea();
                                          if(ocean3 > max)
                                          {
                                             max = ocean3;
                                             big = c;
                                          }
                                          break;
            }                                       
        }
        System.out.printf ("%20s%10s%,20d%10s", "The Largest continent is", big.getContinentName(), max, "square km");
    }
    
    ////Method with for loop, varibles set to zero, and switch
    //to print  most populatated continent
    public void displayMostPopulatedContinent() 
    {
         long sa2 = 0;
         long ca2 = 0;
         long asia2 = 0;
         long euro2 = 0;
         long africa2 = 0;
         long ameri2 = 0;
         long ant2 = 0;
         long ausi2 = 0;
         long na2 = 0;
         long ocean2 = 0;
         long max = 0;    
         
         Country big = new Country ("","",0,0);       
         
         for (int i = 0; i < list.size(); i++)
         {
            Country c = list.get(i);
            String continent = c.getContinentName();
            switch (continent)
            {        
               case "South America":      
                                          sa2 += c.getCountryPopulation();
                                          if(sa2 > max)
                                          {
                                             max = sa2;
                                             big = c;
                                          }
                                          break;
               case "Central America":    ca2 += c.getCountryPopulation();
                                          if(ca2 > max)
                                          {
                                             max = ca2;
                                             big = c;
                                          }
                                          break;
               case "Asia":               asia2 += c.getCountryPopulation();             
                                          if(asia2 > max)
                                          {
                                             max = asia2;
                                             big = c;
                                          }                                          
                                          break;
               case "Europe":             euro2 += c.getCountryPopulation();
                                          if(euro2 > max)
                                          { 
                                             max = euro2;
                                             big = c;
                                          }
                                          break;
               case "Africa":             africa2 += c.getCountryPopulation();
                                          if(africa2 > max)
                                          {
                                             max = africa2;
                                             big = c;
                                          }                                         
                                          break;
               case "America":            ameri2 += c.getCountryPopulation();
                                          if(ameri2 > max)
                                          {
                                             
                                             max = ameri2;
                                             big = c;
                                          }                                          
                                          break;
               case "Antarctica":         ant2 += c.getCountryPopulation();
                                          if(ant2 > max)
                                          {
                                             max = ant2;
                                             big = c;
                                          }                                          
                                          break;
               case "Australia":         ausi2 += c.getCountryPopulation();
                                         if(ausi2 > max)
                                          {
                                             max = ausi2;
                                             big = c;
                                          }                                          
                                          break;                                  
               case "North America":      na2 += c.getCountryPopulation();
                                          if(na2 > max)
                                          {
                                             max = na2;
                                             big = c;
                                          }                                         
                                          break;
               case "Oceania":            ocean2 += c.getCountryPopulation();
                                          if(ocean2 > max)
                                          {
                                             max = ocean2;
                                             big = c;
                                          }
                                          break;
            }                                       
        }
        System.out.println();
        System.out.printf ("%20s%10s%,20d%10s", "The most populated continent is", big.getContinentName(), max, "people");
        System.out.println();
    }
    }
