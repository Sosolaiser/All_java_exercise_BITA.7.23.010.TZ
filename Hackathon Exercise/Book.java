public class Book{
    private String bookname;
    private String author;
    private String publisher;
    public Book(String bookname,String author,String publisher){
        this.bookname=bookname;
        this.author=author;
        this.publisher=publisher;
    }
    public void setName(String name){
        this.bookname=bookname;}
    public String getName(){
        return bookname;}
    public void setauthor(String author){
        this.author=author;}
    public String getauthor(){
        return author;}
    public void setPublisher(String publisher){
        this.publisher=publisher;}
    public String getpublisher(){
        return publisher;}

    public String getBookInfo(){
        return "Name:"+bookname+",Author:"+author+",Publisher:"+publisher;
    }
    
    }
