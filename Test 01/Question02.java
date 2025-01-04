import java.util.Scanner;
public class Question02 {
    public static String input(String data){
        Scanner sc = new Scanner(System.in);
        System.out.print(data);
        String r = sc.nextLine();
        return r;
    }
    public static void main(String[] args) {
        String NAME = input("Enter name:");
        String AGE = input("Enter age:");
        String CITY = input("Enter name of a city:");
        String COLLEGE = input("Enter name of a college:");
        String PROFESSION = input("Enter profession:");
        String ANIMAL = input("Enter type of animal:");
        System.out.println("A person named"+ NAME+" who lived in "+CITY+".\n  At the age of "+AGE+", "+NAME+" went to college at "+COLLEGE+".\n "+NAME+" graduated and went to work as a "+PROFESSION+".\n  Then, "+NAME+" adopted a(n) "+ANIMAL);
    }
}