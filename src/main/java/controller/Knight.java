package controller;

import java.util.ArrayList;

public class Knight {
    public enum knights{
        LOWER_KNIGHT,
        MIDDLE_KNIGHT,
        HIGHEST_KNIGHT;
    }

    private int years;
    private int healthPoint;
    private String  typeOfKnight;
    private ArrayList<Ammunition> ammunitions;

    public Knight(int years, int healthPoint, String typeOfKnight, ArrayList<Ammunition> ammunitions) {
        this.years = years;
        this.healthPoint = healthPoint;
        this.typeOfKnight = typeOfKnight;
        this.ammunitions = ammunitions;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public String getTypeOfKnight() {
        return typeOfKnight;
    }

    public void setTypeOfKnight(String name) {
        this.typeOfKnight = name;
    }

    public ArrayList<Ammunition> getAmmunitions() {
        return ammunitions;
    }

    public void setAmmunitions(ArrayList<Ammunition> ammunitions) {
        this.ammunitions = ammunitions;
    }
    @Override
    public String toString() {
        StringBuilder knightDescription = new StringBuilder("\n" + "Type of knight: " + typeOfKnight
                + ". Hit points: " + healthPoint + ". Years " + years +  ".");
        if (!ammunitions.isEmpty()) {
            knightDescription.append("\n" + "----------AMMUNITIONS----------" + "\n");
            for (Ammunition ammunition : ammunitions) {
                knightDescription.append(new StringBuilder(ammunition.toString()));
            }
        }
        return new String(knightDescription);
    }
}
