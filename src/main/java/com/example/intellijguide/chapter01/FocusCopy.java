package com.example.intellijguide.chapter01;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {
  public void copyFocus() {
    List<String> members = new ArrayList<>();

    members.add(new Member().getName());
    members.add(new Member().getName());
    members.add(new Member().getName());
    members.add(new Member().getName());

  }
}
