package controller;

public class Armor extends Ammunition {

    private int healthPointOfArmor;
    private String typeOfArmor;
    private String size;

    public Armor(String typeOfArmor, String size, int healthPointOfArmor, int cost, int weight) {
        super(cost, weight);
        this.typeOfArmor = typeOfArmor;
        this.size = size;
        this.healthPointOfArmor = healthPointOfArmor;
    }

    public int getHealthPointOfArmor() {
        return healthPointOfArmor;
    }

    public void setHealthPointOfArmor(int healthPointOfArmor) {
        this.healthPointOfArmor = healthPointOfArmor;
    }

    public String getTypeOfArmor() {
        return typeOfArmor;
    }

    public void setTypeOfArmor(String typeOfArmor) {
        this.typeOfArmor = typeOfArmor;
    }

    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nArmor has " + healthPointOfArmor + " health Point. " + "It`s a " + typeOfArmor +
                " Size: " + size + ". " + super.toString();

    }
}