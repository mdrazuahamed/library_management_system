package org.example;

public class ThrillerBookExtd extends BookExtd{
    private int discount=5;

    public ThrillerBookExtd(){

    }
//    public ThrillerBookExtd(String name, String country, AuthorExtd author, int price) {
//        super(name, country, author, price);
//    }


    public ThrillerBookExtd(String name, String country, AuthorExtd author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ThrillerBookExtd(BookExtd book){
        //super(book.getName(), book.getCountry(), book.getAuthor(),book.getGenre());
        super(book);
    }
    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public int getDiscount() {

        System.out.println("In Thriller book class");
        return discount;
    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
}
