public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int month,int day,int year){
        this.day = day;
        this.year = year;
        if(month < 1 || month > 12){
            this.month = 1;
        }
        else{
            this.month = month;
        }
    }
    public String displayDate(){
        return String.format("%d/%d/%d\n",this.month,this.day,this.year);
    }
}