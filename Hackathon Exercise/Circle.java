public class Circle{
    private double radius;
    private String color;
    public Circle(double radius,String color) {
       this.radius = radius;
       this.color = color;
    }
    public String getColor(){
       return color;
    }
    public double getRadius() {
       return this.radius;
    }
    public double getArea() {
       return radius * radius * Math.PI;
    }
    public String toString() {
       return "Circle[radius=" + radius + " color="+color+"]";
    }
 }
 