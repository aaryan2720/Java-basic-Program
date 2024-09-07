public class HelloWorld {
    public static void main(String[] args) {
        User user = new User("Aaryan", "2005-04-20");

        Book book = new Book("Harry Potter", "J.K. Rowling", 270);
        user.borrow(book);

        AudioBook chanakyaniti = new AudioBook("Chanayakya niti", "Chanaykya", 65000);
        Ebook mein_kanf = new Ebook("Mein Kanf", "Hitler ", 770, "pdf");
        System.out.println(chanakyaniti.toString());
        System.out.println(mein_kanf.toString());



        System.out.printf("%s was born back in %s and he now %d years old\n", user.getName(), user.getBirthDay(),
                user.age());
        System.out.printf("%s has borrowed these books:%s\n ", user.getName(), user.borrowedBooks());
    }

}
