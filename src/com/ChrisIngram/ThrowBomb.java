package com.ChrisIngram;

public interface ThrowBomb extends Weapon {
  void tossBomb();
  default void primeBomb(){
    System.out.println("timer set");
  }
}
