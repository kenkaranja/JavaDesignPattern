package Prototype;

public class MainP {
    public static void main(String... args) throws CloneNotSupportedException {
        BookStore one = new BookStore();
        one.setShopName("BookShop1");
        one.loadData();


        BookStore two = one.clone();
        one.getBookList().remove(1);
        two.setShopName("BookShop2");

        System.out.println(one);
        System.out.println(two);
    }
}
