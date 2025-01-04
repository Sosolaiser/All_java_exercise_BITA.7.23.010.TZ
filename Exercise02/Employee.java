public class Employee{
    private String name;
    private int  number;
    public Employee(String name,int number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String toString(){
        return "Employee name is "+this.name+"\nEmployee number is "+this.number;
    }
}
    