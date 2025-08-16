public class Book {

    private String title;
    private String author;

    Book(String title){
        this.title=title;
    }

    Book(String title , String author)
    {
        this(title);
        this.title=title;
        this.author=author;
    }

    void getbookinfo()
    {
        System.out.println("The title of the book is :- "+title+"\nthe aurthor of the book is :-"+author);
    }
 public static void main(String[] args) {
     Book b1= new Book("How to crack the coding interview");
     Book b2= new Book("java complete guide","aman");
     b1.getbookinfo();
     b2.getbookinfo();
     
    }   
}
