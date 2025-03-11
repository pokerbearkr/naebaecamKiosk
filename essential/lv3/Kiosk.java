package essential.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 메뉴 출력 및 유저 입력 관리
 */
public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean conti = true;

        while (conti) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료 | 종료");
            System.out.print("메뉴를 선택하세요: ");
            try {
                int choice = Integer.parseInt(br.readLine());

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    conti = false;
                    continue;
                }

                if (choice < 1 || choice > menuItems.size()) {
                    System.out.println("올바른 숫자를 입력하세요.");
                    continue;
                }

                MenuItem chosenItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴: " + chosenItem.getName() + " | W " + chosenItem.getPrice() + " | " + chosenItem.getDescription());

            } catch (NumberFormatException | IOException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
    }
}
