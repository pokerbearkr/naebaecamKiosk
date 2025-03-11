package essential.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean conti = true;

        // 카테고리 선택 무한 반복
        while (conti) {
            printCategory();

            try {
                int choiceCategory = Integer.parseInt(br.readLine());

                if (choiceCategory == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    conti = false;
                    continue;
                }

                if (choiceCategory < 1 || choiceCategory > menus.size()) {  // 입력에 없는 번호나 음수가 들어올시 예외처리
                    System.out.println("올바른 숫자를 입력하세요.");
                    continue;
                }

                Menu chosenMenu = menus.get(choiceCategory - 1);
                System.out.println("선택한 카테고리: " + chosenMenu.getCategoryType());
                boolean innerConti = true;

                //메뉴 선택 무한 반복
                while (innerConti) {
                    chosenMenu.printMenu();

                    try {
                        int choice = Integer.parseInt(br.readLine());

                        if (choice == 0) {
                            System.out.println("프로그램을 종료합니다.");
                            innerConti = false;
                            continue;
                        }

                        if (choice < 1 || choice > chosenMenu.getMenulist().size()) {  // 입력에 없는 번호나 음수가 들어올시 예외처리
                            System.out.println("올바른 숫자를 입력하세요.");
                            continue;
                        }

                        MenuItem chosenItem = chosenMenu.getMenulist().get(choice-1);
                        System.out.println("선택한 메뉴: " + chosenItem.getName() + " | W " + chosenItem.getPrice() + " | " + chosenItem.getDescription());

                    } catch (NumberFormatException | IOException e) {
                        System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                    }

                }

            } catch (NumberFormatException | IOException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
    }

    // 카테고리 출력
    private  void printCategory() {
        System.out.println("\n[ MAIN MENU ]");
        for (int i = 0; i < menus.size() ; i++) {
            System.out.println((i+1)+". "+menus.get(i).getCategoryType());
        }
        System.out.println("0. 종료");
        System.out.print(" 메뉴를 선택하세요. : ");
    }
}
