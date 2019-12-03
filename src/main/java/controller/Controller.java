package controller;

import model.Model;
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
        Knight knight1 = new Knight(20,100,Knight.knights.LOWER_KNIGHT.name(), new ArrayList<Ammunition>());
        Knight knight2 = new Knight(25,100,Knight.knights.MIDDLE_KNIGHT.name(),new ArrayList<Ammunition>());
        Knight knight3 = new Knight(27,100,Knight.knights.HIGHEST_KNIGHT.name(),new ArrayList<Ammunition>());
        model.buyForFirst(knight1.getAmmunitions(), "Armor","Helmet","Shield", "Sword");
        model.buyForSecond(knight2.getAmmunitions(), "Armor","Helmet","Shield", "Sword");
        model.buyForThird(knight3.getAmmunitions(), "Armor","Helmet","Shield", "Sword");
        System.out.println(knight1);
        System.out.println(knight2);
        System.out.println(knight3);


    }
}
