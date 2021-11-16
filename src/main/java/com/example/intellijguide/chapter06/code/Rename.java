package com.example.intellijguide.chapter06.code;

public class Rename {

  public void rename() {
    String legacy = "a";

    for (int i = 0; i < 10; i++) {
      System.out.println(legacy);
    }

    System.out.println("변수값 : "+ legacy);
    Integer count = calculate();
  }

  // command + shift + F6
  private Integer calculate() {
    return 10;
  }

}
