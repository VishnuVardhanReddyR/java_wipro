package com.example.java;

public class Book {
    private String name;
    private Author author = new Author();
    private double price;
    private int qtyInStock;

    public Book(String name,String authorName,String email, char gender,double price,int qtyInStock){
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        author.setName(authorName);
        author.setEmail(email);
        author.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
