import java.util.Scanner;
public class Question04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter actual value of a piece of property:");
        double actualValue = sc.nextDouble();
        System.out.print("Please enter current tax rate for each $100.00 of assessed value:");
        double tax = sc.nextDouble();
        double assessedValue  = actualValue * 60 / 100;
        double propertyTax = tax * assessedValue / 100;
        System.out.printf("\nThe annual property tax the homeowner will be charged for his property is %,.2fTsh\n",propertyTax);

    }
}