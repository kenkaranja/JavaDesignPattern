package Builder;

public class MainB {
    public static void main(String... args) {
        Phone phone = new PhoneBuilder().setOs("Android").getPhone();
        System.out.println(phone);
    }
}
