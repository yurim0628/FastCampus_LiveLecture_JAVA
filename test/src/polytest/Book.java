/* 7. 아래의 설계조건을 보고 책이라는 VO(DTO) 객체를 설계하시오. */

public class Book {
    private String title;
    private String company;
    private String name;
    private int price;

    public Book() { }

    public Book(String title, String company, String name, int price) {
        this.title = title;
        this.company = company;
        this.name = name;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", company=" + company + ", name=" + name + ", price=" + price + "]";
    }
}
