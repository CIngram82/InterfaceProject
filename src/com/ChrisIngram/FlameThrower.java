package com.ChrisIngram;

public class FlameThrower extends Soldier{

  public FlameThrower(String name) {
    super(name);
    this.ammo = 5;
    this.weapon = "burninating!";
    this.HP = 75;
    this.rank = "Lance Corporal";
  }

  public void battleCry(){
    System.out.println("I love the smell of napalm in the morning");
  }
  public String fireWeapon(){
    if (this.ammo > 0) {
      this.ammo--;
      return "BURN!!!";
    } else {
      return "All out of fuel!";
    }
  }
  public void reload(){
    ammo = 5;
  }
  public void deathCry(){
    System.out.println("Gahh you have killed the burnanator!!");
  }

  @Override
  public void tossBomb() {

  }
}
