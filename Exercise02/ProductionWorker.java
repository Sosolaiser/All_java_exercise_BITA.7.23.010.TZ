public class ProductionWorker extends Employee {
    private int ShiftNumber;
    private double hoursRate;
    public ProductionWorker(String name,int number,int ShiftNumber,double hoursRate){
        super(name, number);
        this.ShiftNumber = ShiftNumber;
        this.hoursRate = hoursRate;
    }
    public int getShiftNumber(){
        return ShiftNumber;
    }  
    public double getHoursRate(){
        return hoursRate;
    }
    public void setShiftNumber(int ShiftNumber){
        this.ShiftNumber = ShiftNumber;
    }
    public void setHoursRate(double hoursRate){
        this.hoursRate = hoursRate;
    }
    public String toString(){
        return super.toString()+"\nEmployee shift is "+getShiftNumber()+"\nEmployee hourse rate is "+getHoursRate();
    }
}