public class Cylinder extends Circle
{
   private double height;
   public Cylinder(double height, double radius,String color) {
      super(radius,color);
      this.height = height;
   }
   public double getHeight() {
      return this.height;
   }
   public double getVolume()
   {
       return super.getArea()*height;
   }
   
   @Override
   public double getArea()
   {
        return 2.0 * Math.PI * getRadius() * height;
   }
}
