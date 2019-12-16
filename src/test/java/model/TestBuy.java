package model;

import model.Entity.Ammunition;
import model.Entity.Knight;
import model.Entity.Knights;
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

