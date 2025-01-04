import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] month = {"January","February","March","April","May","June","July",
        "August","September","October","November","December"};
        int numberMonth = 0;
        double totalRain = 0;
        double average = 0;
        System.out.print("Enter number of year:");
        int year = sc.nextInt();
        for(int y = 1;y <= year;y++){
            for(String m:month){
                System.out.printf("Enter the inches of rainfall of %s for year %d :",m,y);
                totalRain += sc.nextDouble();
            }
        }
        numberMonth = year * 12;
        average = totalRain / numberMonth;
        System.out.printf("\nThe number of months are %d,\nthe total inches of rainfall is %,.2f inches and\n the average rainfall per month is %,.2f",numberMonth,totalRain,average);
    }
}