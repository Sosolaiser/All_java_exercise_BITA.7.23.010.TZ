public class Truck extends Car{
    int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.90; 
        } else {
            return regularPrice * 0.80;
        }
    }

    public static void main(String[] args) {
        Truck heavyTruck = new Truck(100, 50000.00, "Blue", 3000);
        Truck lightTruck = new Truck(120, 30000.00, "White", 1500);

        System.out.println("Heavy Truck - Sale Price: $" + heavyTruck.getSalePrice());
        System.out.println("Light Truck - Sale Price: $" + lightTruck.getSalePrice());
    }
}

