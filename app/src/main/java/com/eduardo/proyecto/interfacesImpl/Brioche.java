package com.eduardo.proyecto.interfacesImpl;

import com.eduardo.proyecto.interfaces.Bread;

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return ": 85 kcal";
    }
}
