public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private int price;

    public Invoice(String number,String description,int quantity,int price){
        this.number = number;
        this.description = description;
        if(quantity < 0){
            this.quantity = 0;
        }
        else{
            this.quantity = quantity;
        }
        
        if(price < 0){
            this.price = 0;
        }
        else{
            this.price = price;
        }


    }
    public int getInvoiceAmount(){
        return this.quantity * this.price;
    }
    public void getInf(){
        System.out.printf("Part number:%s\nDescription:%s\nQuatities:%d\nPrice:%,dTsh\nTotal amount:%,dTsh\n\n\n",number,description,quantity,price,getInvoiceAmount());
    }
    public static void main(String[] args) {
        Invoice hardware1 =new Invoice("Part 1","Tv Screen",23,4000);
        hardware1.getInf();
        Invoice hardware2 =new Invoice("Part 2","Car engin",50,50000);
        hardware2.getInf();
        Invoice hardware3 =new Invoice("Part 3","Radio",-10,-200);
        hardware3.getInf();
    }
}