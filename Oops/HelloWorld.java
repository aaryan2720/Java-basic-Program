
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Aaryan";
        user.birthDay = LocalDate.parse("2005-04-20");

        Book book = new Book();

        book.title = "Harry Potter";
        book.author = "J.K. Rowling";

        user.borrow(book);

       
        System.out.printf("\n%s was born back in %s and he now %d years old\n ",user.name,user.birthDay.toString(),user.age());
        System.out.printf("\n%s has borrowed these books:%s \n ",user.name,user.books.toString());
    }
    
}
