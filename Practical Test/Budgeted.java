import java.util.Scanner;
public class Budgeted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of budgeted for a month:");
        int budget = sc.nextInt();
        System.out.println("Please enter [F] when finish your budget");
        int n = 1;
        while(true){
            sc = new Scanner(System.in);
            System.out.printf("Enter name of expenses%d:",n);
            String expName = sc.nextLine();
            if(expName.equalsIgnoreCase("f")){
                break;
            }
            System.out.printf("Enter amount used in %s:",expName);
            budget -= sc.nextInt();
            n++;

            
        }
        if(budget > 0){
            System.out.printf("You is under budget by %dTsh",budget);
        }
        else if(budget < 0){
            System.out.printf("You is over budget by %dTsh",-1 * budget);
        }
        else{
            System.out.println("You is balance budget");
        }
    }
}