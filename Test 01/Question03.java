public class Question03 {
    public static void main(String[] args) {
        int earn = 32500;
        int monthPaid = earn / 24;
        int weekPaid = earn / 26;
        int totalPaid = monthPaid + weekPaid;
        int grossPay = earn - totalPaid;
        System.out.printf("Employee earns $32,500 annually.\nHe\\She paid Month paid of %dTsh and week paid %dTsh per year total paid is %dTsh per year.\nHe\\She gross pay is %d\n",monthPaid,weekPaid,totalPaid,grossPay);

    }
}