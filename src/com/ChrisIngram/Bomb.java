package com.ChrisIngram;

public class Bomb {
  public int damage;
  public int timer;

  public Bomb(int damage, int timer) {
    this.damage = damage;
    this.timer = timer;
  }

  public String explosion(){
    return "times up BOOM!";
  }

  @Override
  public String toString() {
    return "Bomb{" +
        "damage=" + damage +
        ", timer=" + timer +
        '}';
  }
}
