package com.example.intellijguide.chapter05;

import java.util.List;

public class Method {

  //command + option + m
  /*
   리팩토링 할 때 많이 사용, 메소드로 하나씩 분리할 때 유용
   하나의 메소드는 하나의 기능만 한다!
   */
  public void extractMethod(List<Book> books) {
    for (Book book : books) {
      loopAuthors(book);
    }
  }

  private void loopAuthors(Book book) {
    for (String s : book.getAuthors()) {
      print(s);
    }
  }

  private void print(String s) {
    if ("jojoldu".equals(s)) {
      System.out.println("담당자가 맞습니다.");
    }
  }

  public static class Book {

    private String title;
    private long price;
    private List<String> authors;

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public long getPrice() {
      return price;
    }

    public void setPrice(long price) {
      this.price = price;
    }

    public List<String> getAuthors() {
      return authors;
    }

    public void setAuthors(List<String> authors) {
      this.authors = authors;
    }

  }

}
