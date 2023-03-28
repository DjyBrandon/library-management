package book;

/**
 * @package: book
 * @Description:
 * @author: Brandon
 * @date: 2023/3/28 17:45
 **/

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean statues;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isStatues() {
        return statues;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatues(boolean statues) {
        this.statues = statues;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", statues=" + ((statues==true)?" 借出 ":" 未借出 ")+
                '}';
    }
}


