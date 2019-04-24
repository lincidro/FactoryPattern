package com.eduardo.proyecto.interfacesImpl;

import com.eduardo.proyecto.interfaces.Filling;

public class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return ": 05 kcal";
    }
}
