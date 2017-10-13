package Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {
    private String shopName;
    List<Book> bookList = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    //Assume it is fetching data from database
    public void loadData() {
        for (int i = 0; i <= 10; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book" + i);
            getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

//    //this is shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    //this is deep cloning
    //helps to create 2 different copies of the object
    @Override
    protected BookStore clone() throws CloneNotSupportedException {
        BookStore bookStore = new BookStore();
        for (Book book : this.getBookList()) {
            bookStore.getBookList().add(book);
        }
        return bookStore;

    }
}
