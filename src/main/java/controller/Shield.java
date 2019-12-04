package controller;



public class Shield extends Ammunition {

    private int healthPointOfShield;
    private String size;

    public Shield(int healthPointOfShield, String size, int cost, int weight) {
        super(cost, weight);
        this.healthPointOfShield = healthPointOfShield;
        this.size = size;
    }

    public int getHealthPointOfShield() {
        return healthPointOfShield;
    }

    public void setHealthPointOfShield(int healthPointOfShield) {
        this.healthPointOfShield = healthPointOfShield;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nShield has " + healthPointOfShield + " health Point "
                + " Size: " + size + ". " + super.toString();

    }
}
