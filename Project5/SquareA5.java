public class SquareA5
   extends RectangleA5
   {
   private double side;
   
   public SquareA5()
   {
      super(1,1);
      side = 1;
   }
   public SquareA5(double side)
   {
      super(side,side);
      this.side = side;
   }
   public SquareA5 (double side, String color, boolean filled)
   {
      super(side,side);
       this.side = side;
   }
   
   public String toString()
   {
      
      String result = "\nSquare Information" +
                      "\nColor:        \t" + color +
                      "\nFilled:       \t" + filled +
                      "\nDate Created: \t" + dateCreated +
                      "\nSide is:      \t" + side +
                      "\nArea is:      \t" + getArea() +
                      "\nPerimter is:  \t" + getPerimeter();
      
      return result;
   }
}