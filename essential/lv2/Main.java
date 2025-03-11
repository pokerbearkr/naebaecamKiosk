package essential.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * MenuItem 따로 분리한 LV2
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<MenuItem> itemList = new ArrayList<>(); //메뉴를 담을 리스트 생성
        itemList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        boolean conti = true;

        while (conti) {

            for (int i = 0; i < itemList.size(); i++) {
                MenuItem curItem = itemList.get(i);
                System.out.println((i + 1) + ". " + curItem.name + "의 가격은 " + curItem.price + "원 입니다. " + curItem.description + "입니다.");
            }

            System.out.println("0. 종료      | 종료");
            System.out.print("메뉴를 선택하세요: ");

            try {
                int choice = Integer.parseInt(br.readLine());  // 유저 선택

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    conti = false;
                    continue;
                }

                if (choice < 1 || choice > itemList.size()) {  // 입력에 없는 번호나 음수가 들어올시 예외처리
                    System.out.println("올바른 숫자를 입력하세요.");
                    continue;
                }

                MenuItem chosenItem = itemList.get(choice - 1);
                System.out.println("선택한 메뉴 : " + chosenItem.name + " | " + chosenItem.price + "원 | " + chosenItem.description + "입니다.");

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
    }
}
