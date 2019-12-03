package model;

import controller.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Model {




    public void sortAmmunitionsByWeight(Knight knight){
        Collections.sort(knight.getAmmunitions(), new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Ammunition a1 = (Ammunition) o1;
                Ammunition a2 = (Ammunition) o2;
                if (a1.getWeight() > a2.getWeight()){
                    return 1;
                }
                if (a1.getWeight() < a2.getWeight()){
                    return -1;
                }
                return 0;
            }
        });
    }

    public void buyForFirst(ArrayList<Ammunition> inventory, String... ammunition) {
        Ammunition temp;
        for (int i = 0; i < ammunition.length; i++) {
            temp = defineAmmunitionForFirst(ammunition[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }
    public void buyForSecond(ArrayList<Ammunition> inventory, String... ammunition) {
        Ammunition temp;
        for (int i = 0; i < ammunition.length; i++) {
            temp = defineAmmunitionForSecond(ammunition[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }
    public void buyForThird(ArrayList<Ammunition> inventory, String... ammunition) {
        Ammunition temp;
        for (int i = 0; i < ammunition.length; i++) {
            temp = defineAmmunitionForThird(ammunition[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }

    private Ammunition defineAmmunitionForFirst(String type) {
        switch (type) {
            case "Armor":
                return new Armor("Light Armor", "L", 200, 50, 30);
            case "Helmet":
                return new Helmet("L", "Open", 25, 5);
            case "Shield":
                return new Shield(200, "M", 20, 8);
            case "Sword":
                return new Sword(false, 55, 50, 8);
            default:
                System.out.println("Sir, I don't have " + type + ".");
                return null;
        }

    }
    private Ammunition defineAmmunitionForSecond(String type) {
        switch (type) {
            case "Armor":
                return new Armor("Middle Armor", "M", 250, 60, 35);
            case "Helmet":
                return new Helmet("S", "Open", 25, 5);
            case "Shield":
                return new Shield(250, "S", 30, 10);
            case "Sword":
                return new Sword(false, 55, 50, 8);
            default:
                System.out.println("Sir, I don't have " + type + ".");
                return null;
        }

    }
    private Ammunition defineAmmunitionForThird(String type) {
        switch (type) {
            case "Armor":
                return new Armor("Highest Armor", "l", 350, 80, 40);
            case "Helmet":
                return new Helmet("l", "Closed", 35, 7);
            case "Shield":
                return new Shield(250, "l", 30, 12);
            case "Sword":
                return new Sword(true, 100, 75, 13);
            default:
                System.out.println("Sir, I don't have " + type + ".");
                return null;
        }

    }
}
