public class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    public double perimiter(){
        return 2*(length + width);
    }
    public double area(){
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(30,40);
        System.out.println("Area = "+rec.area());
        System.out.println("Perimeter = "+rec.perimiter());
    }
}