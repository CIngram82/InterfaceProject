package com.ChrisIngram;

public abstract class Soldier implements ThrowBomb, Death {
  protected String rank;
  protected int HP;
  protected int ammo;
  protected String weapon;
  protected String name;

  public Soldier(String name) {
    this.name = name;
  }

  void walk(){
    System.out.println("Left, Left, Left, Right, Left!");
  }

  void eat(){
    System.out.println("I love MREs!");
  }
  public abstract void battleCry();
}

