import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int negative = 0;
        while(negative >= 0){
            total += negative;
            System.out.print("Enter a series of positive numbers:");
            negative = sc.nextInt();

        }
        System.out.printf("The sum of all positive numbers is %,d",total);

    }
}