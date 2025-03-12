package challenge.lv2;

import java.util.List;

public class Menu {
    //필드에 private으로 선언
    private final String categoryType;
    private final List<MenuItem> menulist;

    //생성자
    public Menu(String categoryType, List<MenuItem> menulist) {
        this.categoryType = categoryType;
        this.menulist = menulist;
    }

    //Getter
    public String getCategoryType() {
        return categoryType;
    }

    public List<MenuItem> getMenulist() {
        return menulist;
    }

    // 메뉴 출력 함수
    public void printMenu() {
        System.out.println("[ "+categoryType+" MENU ]");
        for (int i = 0; i < menulist.size(); i++) {
            MenuItem list = menulist.get(i);
            System.out.println((i+1)+". "+list.getName()+" | w. " + list.getPrice()+" | "+list.getDescription());
        }
        System.out.println("0. 종료");
        System.out.println(" 메뉴를 선택하세요. : ");
    }

}
