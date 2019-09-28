import java.util.*;
public class MyShapesAbstract5 {
  public static void main(String[] args) {
   //Create an ArrayList
   ArrayList <GeometricObjectAbstract5> shapes = new ArrayList<>();
   
   //Insert shapes into ArrayList
   shapes.add (new CircleA5());
   shapes.add (new RectangleA5());
   shapes.add (new SquareA5(10));
   shapes.add (new TriangleA5());
   shapes.add (new CircleA5(10));
   shapes.add (new RectangleA5(5,10));
   shapes.add (new TriangleA5(3,4,5));
   shapes.add (new SquareA5(3));
   
   //Display the shapes in the ArrayList
   for (int i = 0; i < shapes.size(); i++)
      System.out.println (shapes.get(i));


   //Display the number of each shape type (Circle, Rectangle, Sqaure, and Triangle)
   //Display the total area of each shape type (Circle, Rectangle, Square, and Triangle)
   //Display the total perimeter of all shapes.
  
   double totalPerimeters = 0;
   double totalAreas = 0;
   
   for (int i = 0; i < shapes.size(); i++){
      GeometricObjectAbstract5 go = shapes.get(i);
      totalPerimeters += go.getPerimeter();
      totalAreas += go.getArea();
   }
     
   System.out.printf ("\n\n\n\t%-30s%13.2f","Total of all perimeters",totalPerimeters);
   System.out.printf ("\n\n\n\t%-30s%13.2f","Total of all areas",totalAreas);


  }
}