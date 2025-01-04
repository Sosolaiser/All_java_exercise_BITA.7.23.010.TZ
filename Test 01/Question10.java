public class Question10 {
    public static void main(String[] args) {
        int no = 1;
        System.out.println("N\t\t10*N\t\t100*N\t\t100*N");
        while(no <= 5){
        int n1 = no;
        int n2 = no * 10;
        int n3 = no * 100;
        int n4 = no * 1000;
        System.out.printf("%d\t\t%d\t\t%d\t\t%d\n",n1,n2,n3,n4);
        no++;
        }
    }
}