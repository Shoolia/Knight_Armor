package controller;

public class Ammunition {

    private double cost;
    private double weight;

    public Ammunition(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "cost=" + cost +
                ", weight=" + weight;
    }
}
