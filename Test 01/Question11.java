import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the speed of a vehicle (in miles per hour) :");
        int speed = sc.nextInt();
        System.out.print("Please enter number of hours it has traveled :");
        int time = sc.nextInt();
        int distance = 0;
        System.out.println("Hour\t\tDistance Traveled");
        for(int m = 1;m <= time;m++){
            distance = m * speed;
            System.out.printf("%d\t\t%d\n",m,distance);
        }
    }
}