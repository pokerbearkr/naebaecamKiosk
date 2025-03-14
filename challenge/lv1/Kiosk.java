package challenge.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * UserCart 추가해서 장바구니 기능 구현
 */
public class Kiosk {
    private List<Menu> menus;
    private UserCart cart;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.cart = new UserCart();
    }

    // 키오스크 시작
    public void start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean conti = true;

        while (conti) {
            printMainMenu();
            try {
                int choice = Integer.parseInt(br.readLine());

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    conti = false;
                    continue;
                }

                if (choice == 9) {
                    cart.printCart();
                    continue;
                }

                if (choice == 99) {
                    processOrder();
                    continue;
                }

                if (choice < 1 || choice > menus.size()) {
                    System.out.println("올바른 숫자를 입력하세요.");
                    continue;
                }

                Menu selectedMenu = menus.get(choice - 1);
                processMenuSelection(br, selectedMenu);

            } catch (NumberFormatException | IOException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
    }

    //메뉴 출력
    private void printMainMenu() {
        System.out.println("\n[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getCategoryType());
        }
        System.out.println("9. 장바구니 보기");
        System.out.println("99. 주문하기");
        System.out.println("0. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    //메뉴 선택을 함수로 빼서 가독성 향상
    private void processMenuSelection(BufferedReader br, Menu selectedMenu) throws IOException {
        boolean inMenu = true;

        while (inMenu) {
            selectedMenu.printMenu();
            int choice = Integer.parseInt(br.readLine());

            if (choice == 0) {
                inMenu = false;
                continue;
            }

            if (choice < 1 || choice > selectedMenu.getMenulist().size()) {
                System.out.println("올바른 숫자를 입력하세요.");
                continue;
            }

            MenuItem selectedItem = selectedMenu.getMenulist().get(choice - 1);
            System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            System.out.print("장바구니에 추가하시겠습니까? (Y/N): ");

            String response = br.readLine().trim().toUpperCase();
            if (response.equals("Y")) {
                cart.addCart(selectedItem);
            } else {
                System.out.println("추가하지 않았습니다.");
            }
        }
    }

    //주문하기 장바구니가 비어있으면 주문불가
    private void processOrder() {
        if (!cart.haveItem()) {
            System.out.println("장바구니가 비어 있어 주문할 수 없습니다.");
            return;
        }
        cart.printCart();
        System.out.println("주문하시겠습니까? (Y/N): ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String response = br.readLine().trim().toUpperCase(); //대소문자 및 공백 구분안해도 되게
            if (response.equals("Y")) {
                cart.clearCart();
            } else {
                System.out.println("주문이 취소되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("입력 오류 발생. 다시 시도해주세요.");
        }
    }
}
