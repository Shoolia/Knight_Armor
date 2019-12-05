package controller;

import model.Model;
import model.typesOfAmmunition.Ammunition;
import model.typesOfKnight.Knight;
import model.typesOfKnight.Knights;
import view.View;

import java.util.ArrayList;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        view.printMessage(View.HELLO);
        Knight knight = new Knight(20,100, Knights.LOWER_KNIGHT.name(), new ArrayList<Ammunition>());
        model.buy(knight.getAmmunition(), "Armor","Helmet","Shield", "Sword");
        System.out.println(knight);
        model.sortAmmunitionByWeight(knight);
        System.out.println("\n" + "-----------FILTERED BY WEIGHT -----------");
        System.out.println(knight.getAmmunition());
        model.sortAmmunitionByCost(knight);
        System.out.println("\n" + "-----------FILTERED BY COST -----------");
        System.out.println(knight.getAmmunition());
        System.out.println("\n" + "-----------Ammunition in range-----------");
        System.out.println(model.findInCostRange(knight, 19,26));
    }
}
