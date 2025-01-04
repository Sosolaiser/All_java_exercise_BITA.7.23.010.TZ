import java.util.Scanner;
public class Question01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 digit integer:");
        String x = sc.nextLine();
        String y = "" + x.charAt(1) + x.charAt(0);
        int X = Integer.valueOf(x);
        int Y = Integer.valueOf(y);
        int z = X + Y;
        System.out.printf("The value of x is %d and value of y is %d and x+y = %d\n",X,Y,z);
        

    }
}