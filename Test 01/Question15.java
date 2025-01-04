import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = 0;
        System.out.print("Enter a series of integers:");
        n = sc.nextInt();
        int largest = n;
        int smallest = n;
    
        while(n != -99){
            if(n > largest){
                largest = n;
            }
            if(n < smallest){
                smallest = n;
            }
            System.out.print("Enter a series of integers:");
            n = sc.nextInt();

        }
        System.out.printf("The smallest number is %,d and largest number is %,d",smallest,largest);

    }
}
