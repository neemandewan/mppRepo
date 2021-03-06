package assignment09.prob9;

import java.util.List;

public class Main {

    public static void main(String[] args) {
   
        Book book = new Book("test", 1);
        List<BookCopy> copies = book.getCopies();
        copies.forEach(copy -> copy.changeAvailability());

        //test
        System.out.println(book.isAvailable());
    }

}
