package essential.lv4;

import java.util.List;

public class Menu {
    private String categoryType;
    private List<MenuItem> menulist;

    public Menu(String categoryType, List<MenuItem> menulist) {
        this.categoryType = categoryType;
        this.menulist = menulist;
    }

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
            System.out.println((i+1)+". "+list.name+" | w. " + list.price+" | "+list.description);
        }
        System.out.println("0. 종료");
        System.out.println(" 메뉴를 선택하세요. : ");
    }

}
