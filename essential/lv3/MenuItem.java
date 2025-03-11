package essential.lv3;

public class MenuItem {
    String name;
    int price;
    String description;

    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
