package challenge.lv2;

/**
 * toString 오버라이딩 추가
 * 장바구니 아이템의 개수를 세는 클래스
 */
public class UserCartItem {
    // 아이템 이름과 개수를 선언
    private final MenuItem menuItem;
    private int quantity;

    // 생성자
    public UserCartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // getter
    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    // 1종류 아이템의 총 가격
    public int getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return menuItem.getName() + " | ₩ " + menuItem.getPrice() + " | 수량: " + quantity + " | 합계: ₩ " + getTotalPrice();
    }
}
