import java.util.Scanner;
public class SeriesOfPositiveNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        int n = 0;
        while(number >= 0){
            n+=1;
            sum += number;
            System.out.printf("Enter a series%d of positive number:",n);
            number = sc.nextDouble();
        }
        System.out.println("The sum of all series positive numbers is "+sum);
    }
}