package week3_oopbasic;

public class MoveVO {
    private String title;
    private String actor;
    private String productionCompany;
    private String releaseDate;
    private int price;
    private String rating;

    public MoveVO(String title, String actor, String productionCompany, String releaseDate, int price, String rating) {
        this.title = title;
        this.actor = actor;
        this.productionCompany = productionCompany;
        this.releaseDate = releaseDate;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nActor: " + actor +
                "\nProduction Company: " + productionCompany +
                "\nRelease Date: " + releaseDate +
                "\nPrice: " + price +
                "\nRating: " + rating + "\n";
    }
}
