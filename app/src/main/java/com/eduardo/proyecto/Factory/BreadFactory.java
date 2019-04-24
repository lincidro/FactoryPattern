package com.eduardo.proyecto.Factory;

import com.eduardo.proyecto.interfacesImpl.Baguette;
import com.eduardo.proyecto.interfacesImpl.Brioche;
import com.eduardo.proyecto.Factory.Abstract.AbstractFactory;
import com.eduardo.proyecto.interfaces.Bread;
import com.eduardo.proyecto.interfaces.Filling;

public class BreadFactory extends AbstractFactory {
    @Override
    public Bread getBread(String bread) {
        if(bread.equals("BRI")){
            return new Brioche();
        }
        else if(bread.equals("BAG")){
            return new Baguette();
        }
        return null;
    }

    @Override
    public Filling getFilling(String filling) {
        return null;
    }
}
