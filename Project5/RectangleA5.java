public class RectangleA5 
    extends GeometricObjectAbstract5 
   {
   private double width;
   private double height;
   
   public RectangleA5() 
   {
   }
   
   public RectangleA5(double width, double height) 
   {
     this.width = width;
     this.height = height;
   }
   
   public RectangleA5(double width, double height, String color, boolean filled) 
   {
     this.width = width;
     this.height = height;
     setColor(color);
     setFilled(filled);
   }

   /** Return width */
   public double getWidth() 
   {
     return width;
   }

   /** Set a new width */
   public void setWidth(double width) 
   {
     this.width = width;
   }
   
   /** Return height */
   public double getHeight() 
   {
     return height;
   }
   
   /** Set a new height */
   public void setHeight(double height) 
   {
     this.height = height;
   }

   /** Return area */
   public double getArea() 
   {
     return width * height;
   }

   /** Return perimeter */
   public double getPerimeter() 
   {
     return 2 * (width + height);
   }
   public String toString()
   {
     String result = "\nRectangle Information" +
                     "\n" + super.toString() +
                     "\nWidth is:    \t" + getWidth() +
                     "\nHeight is:   \t" + getHeight() +
                     "\nArea is:     \t" + getArea() + 
                     "\nPerimeter is:\t" + getPerimeter();
                       
               
     return result;
    }

}
