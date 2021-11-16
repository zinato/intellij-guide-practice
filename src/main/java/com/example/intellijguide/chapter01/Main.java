package com.example.intellijguide.chapter01;

public class Main {

  public static void main(String[] args) {
    EmailSender emailSender = new EmailSender(1L, "zinato", "zinato@naver.com");
    emailSender.send("test@naver.com");
    Math.random();

  }

}
