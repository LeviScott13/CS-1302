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
import java.util.ArrayList;
import java.util.*;
public class MyGenerics8{
   //Declarations
   
   
   //****************************************************************************
   //No-argument constructor:
   //****************************************************************************
   public MyGenerics8 ()
   {
   
   }//end of constructor
   
   //****************************************************************************
   //max:   Receives a generic one-dimensional array and returns the maximum
   //       value in the array.
   //****************************************************************************
   public <E extends Comparable<E>> E max(E[] list)
   {
      E max = list[0];//Set max to 0
      for (int i = 0; i < list.length; i++)//for loop to go through array
         if (list[i].compareTo(max) > 0)//Compares index at position i to max at position 0
            max = list[i];//sets the max number thats at i 
      return max;//return 
   }//end of max
    
   //****************************************************************************
   //max:   Receives a generic two-dimensional array and returns the maximum
   //       value in the array.
   //****************************************************************************
   public <E extends Comparable<E>> E max(E[][] list)
   {
      E max = list[0][0];//Sets max to 0
      for(int r = 0; r < list.length; r++)//for loop to go through the row of 2d array
         for (int c = 0; c < list.length; c++)//for loop to go through the collumn of 2d array
            if (list[r][c].compareTo(max) > 0)//Compares index at position r,c to max at position 0,0
               max = list[r][c];//Sets the max number thats at position r,c
      return max;//return max
      
   }
   
   //****************************************************************************
   //largest:     Receives a generic arrayList and returns the maximum
   //             value in the array.
   //****************************************************************************
   public <E extends Comparable<E>> E largest(ArrayList<E> list) 
   {
      E largest = list.get(0);//Sets max to 0
      for (int i = 0; i < list.size(); i++)//for loop to go through ArrayList
         if (list.get(i).compareTo(largest) > 0)//Compares index at position i to largest at position 0
         largest = list.get(i);//Compares index at position i to largest at position 0
      return largest;//return largest
   }
    
   //****************************************************************************
   //binarySearch:     Receives a generic one-dimensional array and a generic key
   //                  and returns the location of the key (positive) or
   //                  a negative location if not found.
   //****************************************************************************
   public <E extends Comparable<E>> int binarySearch(E[] list, E key) 
   {
      int low = 0;//Sets low to 0
      int high = list.length - 1;//sets high to array length
      return binarySearch (list, key, low, high);//returns binary search with low and high
   }
   
   public <E extends Comparable<E>> int binarySearch(E[] list, E key, int low, int high)//helper method
   {
      if (low > high)
         return - low - 1;//returns negative index if numbers not there 
     
      int mid = (low + high)/2;//initialize mid 
      if (key.compareTo(list[mid]) > 0)
         return binarySearch(list, key, mid + 1, high);//breaks up the array if the number is to the right of mid
      else if (key.compareTo(list[mid]) < 0)
         return binarySearch(list, key, low, mid - 1);//breaks up the array if the number is to the left of mid
      else
         return mid;//if neither return mid
   }

   //****************************************************************************
   //sort:     Receives a generic arrayList and returns nothing.
   //****************************************************************************
   public <E extends Comparable<E>> void sort(ArrayList<E> list) 
   {
      for (int i = 0; i < list.size(); i++)//for loop to go through ArrayList
      {
         Collections.sort(list);//Sorts the ArrayList
      }
   }
   //****************************************************************************
   //uniqueItems:    Receives a generic one-dimensional array and removes
   //                the duplicate values in it.When done, it returns 
   //                ArrayList of type generic that contains only the unique values
   //****************************************************************************
   public <E extends Comparable<E>> ArrayList<E> uniqueItems(E[] list) 
   {
      ArrayList<E> elements = new ArrayList<>();//Creates new ArrayList
       
      for (E items: list)//compares items of type generic to the items in the array
      {
         if(!elements.contains(items))
            elements.add(items);//returns items in the array except the duplicates
      }
  
      return elements;//returns those items
   }       
   //****************************************************************************
   //sort:     Receives a generic one-dimensional array and returns nothing.
   //****************************************************************************
   public <E extends Comparable<E>> void sort(E[] list) 
   {
      for (int i = 0; i < list.length; i++)//for loop to go through Array

      {
         Arrays.sort(list);//Sorts the Array
      }
   }
   //****************************************************************************
   //displayOneDList:     Receives a generic one-dimensional array and displays its contents
   //****************************************************************************
   public <E> void displayOneDList(E[] list, String listName)
   {
      System.out.print(listName + "\n");//Displays list names
      for (int i = 0; i < list.length; i++)//for loop to go through the array
      { 
         System.out.print("\t" + list[i].toString());//prints contents of one dimensional arrays and converts to a String
      }
      System.out.println("\n\n");
   } 


   //****************************************************************************
   //displayTwoDList:     Receives a generic two-dimensional array & a string name
   //                     and displays its contents
   //****************************************************************************
   public <E> void displayTwoDList(E[][] list, String listName)
   {
      System.out.print("\n" + listName + "\n");//Displays list names
      for (int r = 0; r < list.length; r++)//for loop to go through row of 2d Array
      {
         System.out.print("\t" + (r + 1));//Prints r index
         for (int c = 0; c < list[r].length; c++)//for loop to go through collumn of 2d Array
         { 
            System.out.print("\t" + list[r][c] + "   ");//prints contents of 2d array and converts to a String
         }   
         System.out.println("\n\n");
      } 
   }
   //****************************************************************************
   //displayArrayList:     Receives a generic arraylist & a string name
   //                      and displays its contents
   //****************************************************************************
   public <E> void displayArrayList(ArrayList <E> list, String listName)
   {
      System.out.print("\n" + listName + "\n");//Displays list names
      for (int i = 0; i < list.size(); i++)//for loop to go through the ArrayList
      { 
         System.out.print("\t" + list.get(i).toString());//prints contents in the ArrayLists and converts to a String
      } 
      System.out.println("\n\n");
   } 
    
}//end of class