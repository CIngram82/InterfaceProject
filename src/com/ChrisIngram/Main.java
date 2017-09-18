package com.ChrisIngram;

public class Main {

    public static void main(String[] args) {
        CannonFodder cfNum1 = new CannonFodder("Mike");
        cfNum1.battleCry();
        cfNum1.eat();

        FlameThrower trogdor = new FlameThrower("Trogdor");
        trogdor.battleCry();
        for ( int i= 0; i < 6 ; i++) {
            System.out.println(trogdor.fireWeapon());
        }
        trogdor.reload();
        cfNum1.deathCry();
        trogdor.walk();
        cfNum1.primeBomb();
        cfNum1.tossBomb();
        trogdor.deathCry();

    }

}
