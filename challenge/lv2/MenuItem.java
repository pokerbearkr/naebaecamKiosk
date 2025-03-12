package challenge.lv2;

/**
 * toString 오버라이딩 추가해서 읽기 편하게만듬
 */
public class MenuItem {
    private String name;
    private int price;
    private String description;

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

    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}
