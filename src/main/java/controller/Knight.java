package controller;



import java.util.ArrayList;
import java.util.List;

public class Knight {
    private int years;
    private int healthPoint;
    private String  typeOfKnight;
    private List<Ammunition> ammunition;

    public Knight(int years, int healthPoint, String typeOfKnight, List<Ammunition> ammunition) {
        this.years = years;
        this.healthPoint = healthPoint;
        this.typeOfKnight = typeOfKnight;
        this.ammunition = ammunition;
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

    public List<Ammunition> getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(List<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        StringBuilder knightDescription = new StringBuilder("\n" + "Type of knight: " + typeOfKnight
                + ". Hit points: " + healthPoint + ". Years " + years +  ".");
        if (!ammunition.isEmpty()) {
            knightDescription.append("\n" + "------------------------------");
            for (Ammunition ammunition : ammunition) {
                knightDescription.append(ammunition.toString());
            }
        }
        return knightDescription.toString();
    }
}
