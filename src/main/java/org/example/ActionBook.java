package org.example;

public class ActionBookExtd extends BookExtd{
    private int discount=15;

    public ActionBookExtd(int discount) {
        this.discount = discount;
    }

//    public ActionBookExtd(String name, String country, AuthorExtd author, int price) {
//        super(name, country, author, price);
//    }

    public ActionBookExtd(String name, String country, AuthorExtd author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ActionBookExtd(BookExtd book) {
        super(book);
    }

    public ActionBookExtd() {
    }

    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }
    public int getDiscount() {

        System.out.println("In Action book class");
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
