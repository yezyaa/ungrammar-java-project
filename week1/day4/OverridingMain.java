package week1.day4;

public class OverridingMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.hello("학생");
        child.hello("대학생");
    }
}