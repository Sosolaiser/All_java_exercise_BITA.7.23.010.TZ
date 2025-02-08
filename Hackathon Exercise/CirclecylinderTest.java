public class CirclecylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Green");
        System.out.println(circle.toString());
        System.out.println("Circle area is: " + circle.getArea());

        Cylinder cylinder = new Cylinder(29.4,5.7,"Yellow");
        System.out.println(cylinder.toString());
        System.out.println("Cylinder area is: " + cylinder.getArea());
        System.out.println("Cylinder volume is: " + cylinder.getVolume());
    }

}
