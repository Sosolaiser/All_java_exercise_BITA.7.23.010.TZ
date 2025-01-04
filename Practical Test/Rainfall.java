import java.util.Scanner;
public class Rainfall{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] month = {"January","February","March","April","May","June","July",
    	"August","September","October","November","December"
    };
    int total = 0;
    System.out.print("Enter number of years:");
    int years = sc.nextInt();
    for(int i = 1;i <= years; i++){
        for(String mon:month){
        System.out.printf("Enter inches rainfall of %s for year%d:",mon,i);
        total += sc.nextInt();
        }
    }
    
    int numberMonth = years * 12;
    int average = total / numberMonth;
    System.out.println("The number of rainfull:"+numberMonth);
    System.out.println("The total inches of rainfall:"+total);
    System.out.println("The average rainfall per month:"+average);

    }
}