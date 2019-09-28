public class TriangleA5
   extends GeometricObjectAbstract5
   {
   private double side1 = 1.0;
   private double side2 = 1.0;
   private double side3 = 1.0;
   
   public TriangleA5()
   {
   }
   public TriangleA5(double side1, double side2, double side3)
   {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
   }
   public void setSide1()
   {
      this.side1 = side1;
   }
   public double getSide1()
   {
      return side1;
   }
     public void setSide2()
   {
      this.side2 = side2;
   }
   public double getSide2()
   {
      return side2;
   }
   public void setSide3()
   {
      this.side3 = side3;
   }
   public double getSide3()
   {
      return side3;
   }
   public double getArea()
   {
      double s;
      s = (side1 + side2 + side3)/2;
      
      return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   }
   public double getPerimeter()
   {
      return side1 + side2 + side3;
   }
   public String toString()
   {
      super.toString();
      String result = "\nTriangle Information" +
                      "\n" + super.toString() +
                      "\nSide1 is:   \t" + side1 +
                      "\nSide2 is:   \t" + side2 + 
                      "\nSide3 is:   \t" + side3 +
                      "\nArea is:    \t" + getArea() +
                      "\nPerimter is:\t" + getPerimeter();
      
      return result;
   }
}