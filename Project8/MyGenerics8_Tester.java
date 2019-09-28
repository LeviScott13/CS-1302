//*******************************************************************************
//Purpose:     Learning how to use Generics and how to implement Compareable method
//
//Author:      Levi Sutton
//
//Course:      CS1302
//
//Date:        10/19/2017
//
//Program:     MyGenerics8.java
//*******************************************************************************
import java.util.*;
public class MyGenerics8_Tester{
   //Declrations
   
   public static void main (String [] args){
      //Declarations
      Integer [] intList = {4, 7, 2, 20, 30, 22};
      Integer [] intList2 = {2, 20, 30, 22, 30, 17, 30, 20, 17};
      Double [] doubleList = {4.0, 7.5, 2.3, 20.7, 30.1, 22.8};
      String [] stringList = {"Tony","Paige","Denzel","Travis","Austin","Thomas", "Demetrius"};
      String [] stringList2 = {"Tony","Paige","Austin","Tony", "Austin"};
      Character[] charList = {'W','D','A','C','I','F','B'};
      Integer [][] intTwoDList = {{1, 60, 5},
                                  {20, 40, 5},
                                  {100, 300, 15, 27}};
                                  
      String [][] stringTwoDList = {{"Quitman", "Valdosta","Atlanta", "Macon"},
                                    {"Gainesville","Tallahassee","Jacksonville"}};
      
      ArrayList<String> aList = new ArrayList<>();
      aList.add("Tony");
      aList.add("Paige");
      aList.add("Denzel");
          
      //Create an object
      MyGenerics8 object = new MyGenerics8();
      
      //Display different lists
      object.displayOneDList(intList,"1. Integer One D Array");
      object.displayOneDList(doubleList,"2. Double One D Array");
      object.displayOneDList(stringList,"3. String One D Array");
      object.displayOneDList(charList,"4. Character One D Array");
      object.displayTwoDList(intTwoDList,"5. Integer Two D Array");
      object.displayTwoDList(stringTwoDList,"6. String Two D Array");
      object.displayArrayList(aList,"7. A String arraylist");

      //display largest in list
      System.out.println ("8.\tLargest value is one-d integer list is:    \t" + object.max(intList));
      System.out.println ("9.\tLargest value is one-d double list is:    \t" + object.max(doubleList));
      System.out.println ("10.\tLargest value is one-d string list is:    \t" + object.max(stringList));
      System.out.println ("11.\tLargest value is one-d character list is:    \t" + object.max(charList));
      
      System.out.println ("12.\tLargest value is two-d integer list is:    \t" + object.max(intTwoDList));
      System.out.println ("13.\tLargest value is two-d string list is:    \t" + object.max(stringTwoDList));
      System.out.println ("14.\tLargest value is an arrayList is:           \t" + object.largest(aList));

      //Sorting
      object.sort(intList);
      object.sort(doubleList);
      object.sort(stringList);
      object.sort(charList);
      object.sort(aList);

      //Unique Items in OneDArray
      ArrayList<Integer> intArrayList1 = object.uniqueItems(intList2);
      ArrayList<String> stringArrayList2 = object.uniqueItems(stringList2);
      //Display sorted lists
      object.displayOneDList(intList,"15. Integer One D Array intList");
      object.displayOneDList(intList2,"16. Integer One D Array intList2");
      object.displayArrayList(intArrayList1,"17.Integer One D Array intList2  NO DUPLICATES");
      object.displayOneDList(doubleList,"18. Double One D Array");
      object.displayOneDList(stringList,"19. String One D Array stringList");
      object.displayOneDList(stringList2,"20. String One D Array stringList2");
      object.displayArrayList(stringArrayList2,"21. String One D Array stringList2  NO DUPLICATES");
      object.displayOneDList(charList,"21. Character One D Array");
      object.displayArrayList(aList,"23. A String arraylist");

      //BinarySearch
      System.out.println ("24. \tThe location of value 20 in intList is:               \t" + object.binarySearch(intList,20));
      System.out.println ("25. \tThe location of value 77 in intList is:               \t" + object.binarySearch(intList,77));
      System.out.println ("26. \tThe location of value \'C\' in charList is:           \t" + object.binarySearch(charList,'C'));
      System.out.println ("27. \tThe location of value \"Austin\" in stringList is:    \t" + object.binarySearch(stringList,"Austin"));     
   }
}