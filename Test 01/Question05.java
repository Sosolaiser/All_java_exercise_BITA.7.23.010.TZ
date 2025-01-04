import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.err.print("Enter your person's age:");
            int age = sc.nextInt();
            System.err.print("Enter your years of citizenship:");
            int yearCitizen  = sc.nextInt();
            if(age >= 30 && yearCitizen >= 9){
                System.out.println("A person is eligibility for the Senate and House.");
            }
            else{
                System.out.println("A person is not eligibility for the Senate and House.");
            }
        }    
}