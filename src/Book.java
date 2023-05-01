import java.util.Date;

public class Book {
    private String id ;
    private String auther ;
    private String title ;
    private String genre ;
    private double price ;
    private String publishDate ;
    private String describtion ;
public Book() {

}
    public Book(String id, String auther, String title, String genre, double price, String publishDate, String describtion) {
        this.id = id;
        this.auther = auther;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publishDate = publishDate;
        this.describtion = describtion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\n  id=" + id +
                "\n  author='" + auther + '\'' +
                "\n  title='" + title + '\'' +
                "\n  genre='" + genre + '\'' +
                "\n  price=" + price +
                "\n  publishDate=" + publishDate +
                "\n  description='" + describtion + '\'' +
                "\n}\n";
    }

}
