package com.example.intellijguide.chapter07;


import java.util.Arrays;
import java.util.List;

public class Debug {

  public static void main(String[] args) {
    List<Book> books = Arrays.asList(
        new Book("토비의 스플링"),
        new Book("자바 ORM"),
        new Book("클라우드 네이티브 자바")
    );

    for (Book book : books) {
      System.out.println("책이름 : " + book.getTitle());
    }

  }

}
