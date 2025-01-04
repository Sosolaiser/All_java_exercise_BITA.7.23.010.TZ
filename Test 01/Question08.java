import java.util.Scanner;
import java.util.Arrays;
public class Question08 {
    public static String input(String d,String f){
        Scanner sc = new Scanner(System.in);
        System.out.printf(d,f);
        String r = sc.nextLine();
        return r;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double[] minutesList = new double[3];
    String[] nameList = new String[3];
    for(int m = 1;m <= 3;m++){
        String mm = ""+m;
        String name = input("Please enter name of runner %s:",mm);
        String minut = input("Please enter minutes used %s to finish runner:",name);
        double minutes = Double.valueOf(minut);
        int n = m -1;
        minutesList[n] = minutes;
        nameList[n] = name + " at " + minutes;

    }
    Arrays.sort(minutesList);
    String[] ans = new String[3];
    for(int m =0;m<3;m++){
        for(int n = 0; n<3;n++){
            String mt = "" + minutesList[n];
            if(nameList[m].endsWith(mt)){
                ans[n] = nameList[m];
            }
        }
    }
    System.out.println("The order of runner they finished are:");
    for(int m = 1;m <= 3; m++){
        int no = m -1;
        System.out.printf("Number %d is %s minutes\n",m,ans[no]);
    }
    }
}
