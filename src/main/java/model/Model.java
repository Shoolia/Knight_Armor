package model;

import controller.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Model {

    public ArrayList<Ammunition> findInCostRange(Knight knight, double fromCost, double toCost) {
        ArrayList<Ammunition> filteredAmmunition = new ArrayList<>();

        for (Ammunition ammunition : knight.getAmmunition()) {
            double cost = ammunition.getCost();
            if (cost >= fromCost && cost <= toCost) {
                filteredAmmunition.add(ammunition);
            }
        }
        return filteredAmmunition;
    }

    public void sortAmmunitionByWeight(Knight knight) {
        Collections.sort(knight.getAmmunition(), new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition a1, Ammunition a2) {
                return Double.compare(a1.getWeight(), a2.getWeight());
            }
        });
    }


    public void sortAmmunitionByCost(Knight knight) {
        Collections.sort(knight.getAmmunition(), new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition a1, Ammunition a2) {
                return Double.compare(a1.getCost(), a2.getCost());
            }
        });
    }


    public void buy(List<Ammunition> inventory, String... ammunition) {
        Ammunition temp;
        for (int i = 0; i < ammunition.length; i++) {
            temp = defineAmmunitionForKnight(ammunition[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }

    private Ammunition defineAmmunitionForKnight(String type) {
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
                System.out.println("Sorry, we dont have " + type + ".");
                return null;
        }

    }
}


