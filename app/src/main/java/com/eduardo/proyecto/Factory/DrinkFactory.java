package com.eduardo.proyecto.Factory;

import com.eduardo.proyecto.interfaces.Drink;

public class DrinkFactory extends Drink {
    @Override
    public String name() {
        return "Iced tea";
    }

    @Override
    public String calories() {
        return "110 Kcal";
    }
}
