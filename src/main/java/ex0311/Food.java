package ex0311;

public class Food {

    private String name;
    private String price;

    public Food(String name, String price) {
        this.name = name;
        this.price = price;
    }

    Food() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + price;
    }

}
