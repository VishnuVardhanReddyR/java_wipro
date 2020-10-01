package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book_name","Radha","Radha@mail.com", 'F',34.5,1));
        books.add(new Book("book_plus","Prasona","plus@mail.com", 'F',100.5,5));
        books.add(new Book("Anu_book","Ram","Sudda.parshuRam@g-mail.com", 'M',50.5,0));
        for(Book b:books){
            System.out.println("Book Name                : " + b.getName());
            System.out.println("Author Name              : " + b.getAuthor().getName());
            System.out.println("Author Email             : " + b.getAuthor().getEmail());
            System.out.println("Author gender            : " + b.getAuthor().getGender());
            System.out.println("Book price               : " + b.getPrice());
            System.out.println("Number of Books in stock : " + b.getQtyInStock());
            System.out.println(" ");
        }
    }
}
//Output:
//        Book Name                : book_name
//        Author Name              : Radha
//        Author Email             : Radha@mail.com
//        Author gender            : F
//        Book price               : 34.5
//        Number of Books in stock : 1
//
//        Book Name                : book_plus
//        Author Name              : Prasona
//        Author Email             : plus@mail.com
//        Author gender            : F
//        Book price               : 100.5
//        Number of Books in stock : 5
