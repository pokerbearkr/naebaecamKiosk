package essential.lv2;

// 아이템들을 담는 클래스
public class MenuItem {
    String name; // 메뉴 이름
    int price; // 메뉴 가격
    String description; // 메뉴 설명

    // 생성자
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter로 받아옴
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
