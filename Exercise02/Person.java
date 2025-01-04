public class Person {
    private String name;
    private Address address;
    private String telephone;
    public Person(String name,Address address,String telephone){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public String getTelephone(){
        return telephone;
    }
    public String toString(){
        return "Person name is "+getName()+"\n"+getAddress()+"\nTelephone number is "+getTelephone();
        
    }
}