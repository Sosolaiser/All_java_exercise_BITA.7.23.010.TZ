import java.util.Scanner;
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter employee’s ID number:");
        String id = sc.nextLine();
        System.out.print("Please enter hourly rate of pay:");
        double rate = sc.nextDouble();
        System.out.print("Please enter the number of hours worked:");
        double hours = sc.nextDouble();
        double overTime = 0;
        double grossPay;
        double netPay;
        double overTimePayment;
        if(hours > 40){
            overTime = hours - 40;
            overTimePayment = overTime * 1.5;
            hours = 40;
            grossPay = hours * rate;
        }
        else{
            overTimePayment = 0;
            grossPay = hours * rate;
        }
        if(grossPay > 500){
            double tax = grossPay * 0.15;
            netPay = grossPay - tax -20;
        }
        else{
            netPay = grossPay - 20;
        }
        System.out.printf("Employees weekly gross pay is %,.2fTsh\nEmployees weekly overtime hours is %,.2f.\nEmployees weekly overtime payment is %,.2fTsh.\nEmployees weekly net pay is %,.2fTsh\n",grossPay,overTime,overTimePayment,netPay);
        
    }
}
