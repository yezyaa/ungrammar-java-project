package week2.day9;

public class SamsungPhone implements Phone {
    private String customerName;

    @Override
    public void buyPhone(String customerName) {
        this.customerName = customerName;
        System.out.println(customerName + "님이 삼송폰을 샀습니다.");
    }

    @Override
    public void turnOnPhone() {
        System.out.println(customerName + "님이 삼송폰을 켰습니다.");
    }

    @Override
    public void loading() {
        System.out.println("★★★ 폰 켜지는 중 ★★★\n");
    }
}
