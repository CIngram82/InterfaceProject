package com.ChrisIngram;

public class CannonFodder extends Soldier {


  public CannonFodder(String name) {
    super(name);
    this.rank = "Recruit";
    this.HP = 50;
    this.ammo = 30;
    this.weapon = "M16";
  }

  public void battleCry(){
    System.out.println("I'm to young to die");
  }
  public String fireWeapon(){
    if (this.ammo > 0) {
      this.ammo--;
      return "Bang!";
    } else {
      return "I need to reload!";
    }
  }
  public void reload(){
    ammo = 30;
  }
  public void deathCry(){
    System.out.println("I was to young! Tell my wife.. AArrrgggaaa....");
  }
  public void tossBomb(){
    Bomb bomb = new Bomb(100, 1);
    System.out.println(bomb);
  }
  public void primeBomb(){
    System.out.println("set timer to 1");
  }
}
