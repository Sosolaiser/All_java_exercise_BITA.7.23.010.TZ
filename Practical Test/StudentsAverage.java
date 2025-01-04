import java.util.Scanner;
public class StudentsAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int students = sc.nextInt();
        int total = 0;
        int Max = 0;
        int Min = 0;
        int n = 1;
        int datas = 0;
        int[] store = new int[students];
        while(n <= students){
            System.out.printf("Enter score of student number%d:",n);
            datas = sc.nextInt();
            while(datas < 0 || datas > 100){
                System.out.printf("Invalid input try again in student number%d:",n);
                datas = sc.nextInt();
            }
            store[n-1] = datas;
            if(n==1){
                Max = datas;
                Min = datas;
            }
            if(datas > Max){
                Max = datas;
            }
            if(datas < Min){
                Min = datas;
            }
            
            n++;
            
            
        }
        for(int x:store){
            total += x;
        }
        double average = total / students;
        System.out.printf("The average of score is %.2f\nThe minimum score is %d\nThe maximum score is %d",average,Min,Max);
        
    }
}
