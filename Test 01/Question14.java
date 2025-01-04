import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        for(int m = 1; m <= number; m++) {
            for(int n = 1; n <= number; n++) {
                System.out.printf("%d\t",m*n);
            }
            System.out.println();
        }
    }
}