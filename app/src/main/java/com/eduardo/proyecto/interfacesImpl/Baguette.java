package com.eduardo.proyecto.interfacesImpl;

import com.eduardo.proyecto.interfaces.Bread;

public class Baguette implements Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return ": 65 kcal";
    }
}
