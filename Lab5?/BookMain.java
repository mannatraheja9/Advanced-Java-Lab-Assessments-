import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Ikigai", "Hector Garcia");
        Book book2 = new Book(2, "Rich Dad Poor Dad", "Robert Kiyosaki");
        Book book3 = new Book(3, "Dream With Your Eyes Open", "Ronnie Screwvala");
        Book book4 = new Book(4, "Pride and Prejudice", "Jane Austen");

        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);

        for(Book book : arrayList){
            System.out.println("Id: " + book.bookId + "    Name: " + book.bookName + "    Author: " + book.authorName);
        }
    }
}

class Book{
    int bookId;
    String bookName;
    String authorName;

    Book(int bookId, String bookName, String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}