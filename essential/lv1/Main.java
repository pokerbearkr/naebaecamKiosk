package essential.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean conti = true;

        while (conti) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("선택한 메뉴: ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case 2:
                    System.out.println("선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case 3:
                    System.out.println("선택한 메뉴: Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case 4:
                    System.out.println("선택한 메뉴: Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    conti = false;
                    break;
                default:
                    System.out.println("올바른 숫자를 입력하세요.");
                    break;
            }
        }

    }
}
