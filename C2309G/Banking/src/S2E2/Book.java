package S2E2;

public class Book {
    private String Name;
    private Author author;
    private double price;
    private int Qty;

    public Book(String name, Author author, double price, int qty) {
        Name = name;
        this.author = author;
        this.price = price;
        Qty = qty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", Qty=" + Qty +
                '}';
    }
}
