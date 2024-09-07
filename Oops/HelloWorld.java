public class HelloWorld {
    public static void main(String[] args) {
        User user = new User("Aaryan","2005-04-20");

        Book book = new Book();

        book.title = "Harry Potter";
        book.author = "J.K. Rowling";

        user.borrow(book);











       
        System.out.printf("%s was born back in %s and he now %d years old\n",user.getName(),user.getBirthDay(),user.age());
        System.out.printf("%s has borrowed these books:%s\n ",user.getName(),user.books.toString());
    }
    
}
