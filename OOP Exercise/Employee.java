public class Employee {
    private String firstName;
    private String lastName;
    private int monthSalary;
    public Employee(String firstName,String lastName,int monthSalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthSalary < 0){
            this.monthSalary = 0;
        }
        else{
            this.monthSalary = monthSalary;
        }

    }
    public void salaryRaise(int percent){
        this.monthSalary = this.monthSalary + this.monthSalary * percent / 100;
    }
    public int yearSalary(){
        return this.monthSalary * 12;
    }
    public String employeeInf(){
        return String.format("Employee First name:%s\nEmployee Last name:%s\nEmployee Year salary:%,d\n\n",this.firstName,this.lastName,yearSalary());
        
    }
}