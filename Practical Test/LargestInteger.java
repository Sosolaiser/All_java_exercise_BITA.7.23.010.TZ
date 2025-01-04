import java.util.Scanner;
public class LargestInteger {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = 1;
    int largest = 0;
    int number;
    do{
        System.out.printf("Enter integer number%d:",counter);
        number = sc.nextInt();
        if(counter == 1){
            largest = number;
        }
        if(number > largest){
            largest = number;
        }
        counter++;

    }
    while(counter <= 10);
    System.out.println("The largest integer is "+largest);

}
}