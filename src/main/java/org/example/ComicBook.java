package org.example;

public class ComicBookExtd extends BookExtd{
    private int discount=10;
    public ComicBookExtd() {
    }

//    public ComicBookExtd(String name, String country, AuthorExtd author, int price) {
//        super(name, country, author, price);
//    }

    public ComicBookExtd(String name, String country, AuthorExtd author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ComicBookExtd(BookExtd book) {
        super(book);
    }

    public int getDiscount() {
        System.out.println("In Comic class");
        return discount;
    }
    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
