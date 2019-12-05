package model;

import controller.*;
import sun.awt.image.AbstractMultiResolutionImage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Model {

    /**
     * its method need to find Ammunition in range of cost ( from to )
     * @param knight its our first knight, whose got: his years ( int ), health Point ( int ),
     *               type of knight ( String, for example LOWER_KNIGHT or MIDDLE_KNIGHT )
     *               and his Ammunition ( int List<Ammunition>)
     * @param fromCost its start of our range ( interval )
     * @param toCost its finish ouy range ( interval )
     * @return ArrayList of ammunition which included in our range.
     */

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

    /**
     * This method sort our Ammunition by weight;
     * @param knight its our first knight, whose got: his years ( int ), health Point ( int ),
     *      *               type of knight ( String, for example LOWER_KNIGHT or MIDDLE_KNIGHT )
     *      *               and his Ammunition ( int List<Ammunition>)
     *
     */
    public void sortAmmunitionByWeight(Knight knight) {
        Collections.sort(knight.getAmmunition(), new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition a1, Ammunition a2) {
                return Double.compare(a1.getWeight(), a2.getWeight());
            }
        });
    }


    /**
     * This method sort our Ammunition by cost;
     * @param knight its our first knight, whose got: his years ( int ), health Point ( int ),
     *      *      *               type of knight ( String, for example LOWER_KNIGHT or MIDDLE_KNIGHT )
     *      *      *               and his Ammunition ( int List<Ammunition>)
     */
    public void sortAmmunitionByCost(Knight knight) {
        Collections.sort(knight.getAmmunition(), new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition a1, Ammunition a2) {
                return Double.compare(a1.getCost(), a2.getCost());
            }
        });
    }


    /**
     * its a method to buy for our knight ammunition and check which ammunition he need.
     * @param inventory its a list in which we add ammunition for Knight.
     * @param ammunition its ammunition what we try to clothe on Knight, but we can clothe only: Armor, Helmet, Shield, Sword.
     */
    public void buy(List<Ammunition> inventory, String... ammunition) {
        Ammunition temp;
        for (int i = 0; i < ammunition.length; i++) {
            temp = defineAmmunitionForKnight(ammunition[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }

    /**
     * @param type its a word which we check in our switch, if we got it here than insert this values to Knight.
     * @return insert this values to Knight
     */
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


