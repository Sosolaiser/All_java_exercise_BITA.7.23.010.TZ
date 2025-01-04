import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {
        try{ 
        System.out.print("Enter five-digit integer:");
        String number = sc.nextLine();
        int no = Integer.valueOf(number);
        num = "" + no;
        if(num.length() == 5){
            break;
        }

    }
        catch(Exception e){
            System.out.println("You enter wrong format of number");
        }
        System.out.println("Invalid input.\nTry again");
        }
        
        String reverse = "" + num.charAt(4)+ num.charAt(3)
        + num.charAt(2)+ num.charAt(1)+ num.charAt(0);
        if(num.equals(reverse)){
            System.out.printf("Forwards = %s\nBackwards = %s\n The number is palindrome\n",num,reverse);
        }
        else{
            System.out.printf("Forwards = %s\nBackwards = %s\n The number is not palindrome\n",num,reverse);
        }

        
    }
}