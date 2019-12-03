package controller;

public class Sword extends Ammunition {

    private final boolean twoHanded;
    private int damageOfSword;


    public Sword(boolean twoHanded, int damageOfSword, int cost, int weight) {
        super(cost, weight);
        this.twoHanded = twoHanded;
        this.damageOfSword = damageOfSword;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public int getDamageOfSword() {
        return damageOfSword;
    }

    public void setDamageOfSword(int damageOfSword) {
        this.damageOfSword = damageOfSword;
    }

    @Override
    public String toString() {
        String oneOrTwoHandSword = "";
        if (twoHanded == true){
            oneOrTwoHandSword = "two-hands";
        } else {
            oneOrTwoHandSword = "one hand";
        }
        return "\nSword for " + oneOrTwoHandSword
                + ". It can do " + damageOfSword + " damage. " + super.toString();

    }
}

