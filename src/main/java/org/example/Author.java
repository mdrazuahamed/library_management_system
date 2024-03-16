package org.example;

public class AuthorExtd {
    private String name;
    private int age;
    private String country;
    public AuthorExtd(){
    }

    public AuthorExtd(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public AuthorExtd(AuthorExtd author){
        author.name = name;
        author.age = age;
        author.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AuthorExtd{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}

