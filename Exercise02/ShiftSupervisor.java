public class ShiftSupervisor extends Employee{
    private int annnualSalary;
    private int annnualBonus;
    public ShiftSupervisor(String name,int number,int annnualSalary,int annnualBonus){
        super(name, number);
        this.annnualSalary = annnualSalary;
        this.annnualBonus = annnualBonus;
    }
    public int getAnnualSalary(){
        return annnualSalary;
    }
    public int getAnnualBonus(){
        return annnualBonus;
    }
    public void setAnnualBonus(int annnualBonus){
        this.annnualBonus = annnualBonus;
    }
    public void setAnnualSalary(){
        this.annnualSalary = annnualSalary;
    }
    public String toString(){
        return super.toString()+"\nShift Supervisor Annual salary is "+getAnnualSalary()+"\nShift Supervisor Annual bonus "+getAnnualBonus();

    }
}
