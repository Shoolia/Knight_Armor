package model.Entity;


import model.Entity.Ammunition;

public class Helmet extends Ammunition {


    private String closeOrOpenHelmet;
    private String size;

    public Helmet( String size, String closeOrOpenHelmet, int cost, int weight) {
        super(cost, weight);
        this.size = size;
        this.closeOrOpenHelmet = closeOrOpenHelmet;
    }

    public String getCloseOrOpenHelmet() {
        return closeOrOpenHelmet;
    }

    public void setCloseOrOpenHelmet(String closeOrOpenHelmet) {
        this.closeOrOpenHelmet = closeOrOpenHelmet;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nHelmet is  " + closeOrOpenHelmet
                 + " Size: " + size + ". " + super.toString();

    }
}
