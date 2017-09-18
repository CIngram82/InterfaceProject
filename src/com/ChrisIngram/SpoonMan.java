package com.ChrisIngram;

public class SpoonMan extends Soldier implements ExtraOne,ExtraTwo{
  public SpoonMan(String name) {
    super(name);
  }

  @Override
  public int spoon() {
    return 0;
  }

  @Override
  public String fireWeapon() {
    return null;
  }

  @Override
  public void tossBomb() {

  }

  @Override
  public void reload() {

  }

  @Override
  public void battleCry() {
    System.out.println("SpoonMan!");
  }

  @Override
  public void deathCry() {
    System.out.println("Spoon!");
  }
}
