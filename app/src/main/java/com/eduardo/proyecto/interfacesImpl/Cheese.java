package com.eduardo.proyecto.interfacesImpl;

import com.eduardo.proyecto.interfaces.Filling;

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return ": 20 kcal";
    }
}
