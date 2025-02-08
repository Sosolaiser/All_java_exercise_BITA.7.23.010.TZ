public class Student extends Person{
    private String programme;
    private int year;
    private double fee;

    public Student(String name, String address,  String programme,int year,double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
        this.programme = programme;
    }

    public int getYear(){
        return year;
    }
    public double  getFee(){
        return fee;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    @Override
    public String toString() {
        return "Student [name = " + super.getName() + " address=" + super.getAddress() + ", programme=" + programme+ " year " + year +"year"+year+ "]";
    }
}