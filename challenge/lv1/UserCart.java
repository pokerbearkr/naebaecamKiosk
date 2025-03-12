package challenge.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * 장바구니 클래스
 */
public class UserCart {
    //아이템을 담는 리스트
    private List<UserCartItem> userCartItems;

    public UserCart() {
        this.userCartItems = new ArrayList<>();
    }

    //장바구니에 아이템이 들어있는가? 들어있으면 false 없으면 true
    public boolean haveItem() {
        return !userCartItems.isEmpty();
    }

    //장바구니에 물건 추가
    public void addCart(MenuItem menuItem) {
        for (UserCartItem cartItem : userCartItems) {
            if (cartItem.getMenuItem().getName().equals(menuItem.getName())) {
                cartItem.increaseQuantity();
                System.out.println(menuItem.getName() + "의 수량이 증가했습니다.");
                return;
            }
        }
        userCartItems.add(new UserCartItem(menuItem, 1));
        System.out.println(menuItem.getName() + "이(가) 장바구니에 추가되었습니다.");
    }

    //장바구니 내용 출력
    public void printCart() {
        if (userCartItems.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("\n[ 장바구니 목록 ]");
        int total = 0;
        for (UserCartItem item : userCartItems) {
            System.out.println(item);
            total += item.getTotalPrice();
        }
        System.out.println("총 금액: W " + total);
    }

    // 장바구니에 있는 물건의 총 금액 출력
    public int getTotalPrice() {
        int total = 0;
        for (UserCartItem item : userCartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    //주문 후 장바구니 초기화
    public void clearCart() {
        userCartItems.clear();
        System.out.println("주문이 완료되었습니다! 장바구니가 초기화됩니다.");
    }
}
