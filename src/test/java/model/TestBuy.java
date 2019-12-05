package model;

import model.typesOfAmmunition.Ammunition;
import model.typesOfKnight.Knight;
import model.typesOfKnight.Knights;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestBuy {

    Model model = new Model();
    Knight knight = new Knight(20,100, Knights.LOWER_KNIGHT.name(),new ArrayList<Ammunition>());


    @Test
    public void testBuyNotNull() {
        String [] ammum = {"Armor","Helmet"};
        model.buy(knight.getAmmunition(), ammum);
        Assert.assertNotNull(ammum);

    }
    }

