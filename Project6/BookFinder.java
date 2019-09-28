import java.util.Scanner;
import java.util.*;
public class BookFinder
{
   private String fileName;
   private String searchString;
   
   public static void main (String[] args)
   {
   }
   private void getUserInputs()
   {
      Scanner input = new Scanner(System.in);
      System.out.println ("Enter the file name:");
      fileName = input.nextLine();
      System.out.println ("Enter what you are looking for:");
      searchString = input.nextLine();
   }
   private StringBuilder loadRecords()
   {
      StringBuilder build = new StringBuilder();
            
      try 
      {
         Scanner scan = new Scanner("BookList.txt");
         while(scan.hasNext())
         {
            build.append(fileName);
            build.append(searchString);
         }      
      }
      catch (Exception e)
      {
         System.out.println ("Sorry" + searchString + "not found in Booklist.txt" + e);
      }
      finally
      {
         return build;
      }
   }
   private String[] searchRecords(StringBuilder fileContent)
   {
      StringBuilder search = new StringBuilder(fileContent);
      int count = 0;
      String[] words = new String[count]; 
      try
      {
         Scanner s1 = new Scanner("BookList.txt");
         while(s1.hasNextLine()) 
         {
            count++;
         }
         for (int i = 0; i < count; i++)
         {
            search.append(i);
         }
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
      return words;
   }
   private void printOutput(String[] foundRecords)
   {
      
   } 
}