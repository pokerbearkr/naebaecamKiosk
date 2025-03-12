package challenge.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 *  장바구니 와 구매하기 기능 추가한 핵심 LV1
 */
public class Main {

    public static void main(String[] args) {

        List<MenuItem> burgerList = new ArrayList<>(); //버거 리스트
        burgerList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<MenuItem> drinkList = new ArrayList<>(); //음료 리스트
        drinkList.add(new MenuItem("Coke",1500, "코카콜라"));
        drinkList.add(new MenuItem("Sprite",1400, "스프라이트 사이다"));
        drinkList.add(new MenuItem("Coffee",2000, "아메리카노"));

        List<MenuItem> dessertList = new ArrayList<>(); //디저트 리스트
        dessertList.add(new MenuItem("Cake",3000, "초코 케이크"));
        dessertList.add(new MenuItem("Donut",2500, "오리지널 도넛"));
        dessertList.add(new MenuItem("Muffin",1500, "오븐에서 구운 머핀"));

        List<Menu> menus = new ArrayList<>(); //Menu 리스트 생성 후 추가
        menus.add(new Menu("Burgers", burgerList));
        menus.add(new Menu("Drinks", drinkList));
        menus.add(new Menu("Desserts", dessertList));

        Kiosk kiosk = new Kiosk(menus); // 키오스크 생성 및 실행
        kiosk.start();
    }

}
