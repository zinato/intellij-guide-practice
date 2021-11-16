package com.example.intellijguide.chapter05;

public class Variable {

  public void extractVariable() {
    //command + option + v
    String message = String.format("%d + %d = %d", 1, 2, 1 + 2);
    System.out.println(message);
    System.out.println(message);

  }

  public void extractParameter(int x) {
    // command + option + p
    System.out.println(x);
    System.out.println(x);
  }

}
