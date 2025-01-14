public class Sedan {
    public class Sedan extends Car {
        int length;
        public Sedan(int speed, double regularPrice, String color, int length) {
            super(speed, regularPrice, color);
            this.length = length;
        }
    
        @Override
        public double getSalePrice() {
            if (length > 20) {
                return regularPrice * 0.95;
            } else {
                return regularPrice * 0.90; 
            }
        }

        public static void main(String[] args) {
            Sedan longSedan = new Sedan(150, 25000.00, "Black", 22);
            Sedan shortSedan = new Sedan(160, 20000.00, "Red", 18);
    
            System.out.println("Long Sedan - Sale Price: $" + longSedan.getSalePrice());
            System.out.println("Short Sedan - Sale Price: $" + shortSedan.getSalePrice());
        }
    }
      
}
