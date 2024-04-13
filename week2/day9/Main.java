package week2.day9;

public class Main {
    public static void main(String[] args) {
        // samsung phone
        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.buyPhone("재용");
        samsungPhone.turnOnPhone();
        loadingText(samsungPhone);

        // apple phone
        ApplePhone applePhone = new ApplePhone();
        applePhone.buyPhone("잡스");
        applePhone.turnOnPhone();
        loadingText(applePhone);
    }

    public static void loadingText(Phone phone) {
        phone.loading();
    }
}
