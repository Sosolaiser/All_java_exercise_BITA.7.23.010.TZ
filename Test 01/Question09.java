import java.util.Scanner;
public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter quiz score:");
        int score = sc.nextInt();
        if(score == 5){
            System.out.println("A");
        }
        else if(score == 4){
            System.out.println("B");
        }
        else if(score == 3){
            System.out.println("C");
        }
        else if(score == 2){
            System.out.println("D");
        }
        else if(score == 1){
            System.out.println("F");
        }
        else if(score == 0){
            System.out.println("F");
        }
    }
    
}