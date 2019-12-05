package model;

import controller.Ammunition;
import controller.Controller;
import controller.Knight;
import controller.Knights;
import org.junit.Assert;
import org.junit.Test;
import view.View;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestBuy {

    Model model = new Model();
    Knight knight = new Knight(20,100, Knights.LOWER_KNIGHT.name(),new ArrayList<Ammunition>());

    @Test
    public void testBuyMissingItem() {
        String ammum = "Knife";
        model.buy(knight.getAmmunition(), ammum);
        Assert.assertNotNull(ammum);
    }




    }
