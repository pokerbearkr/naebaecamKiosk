package challenge.lv2;

/**
 * 유저 타입을 위한 ENUM
 */
public enum UserType {
    NMP("국가유공자", 0.1),
    SOLDIER("군인", 0.05),
    STUDENT("학생", 0.03),
    NORMAL("일반인", 0.0);

    private final String name;
    private final double discount;

    //생성자
    UserType(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    //getter
    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}
