public class Book {
    private  String title;
    private String author;
    private int pageCount;

    Book(String title , String author,int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return this.title;

    }

    public String getAuthor(){
        return this.author;
    }


    @Override
    public String toString(){
        return String.format("%s by %s", this.title,this.author,this.pageCount);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
