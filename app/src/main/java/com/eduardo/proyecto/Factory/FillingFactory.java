package com.eduardo.proyecto.Factory;

import com.eduardo.proyecto.interfacesImpl.Cheese;
import com.eduardo.proyecto.Factory.Abstract.AbstractFactory;
import com.eduardo.proyecto.interfacesImpl.Tomato;
import com.eduardo.proyecto.interfaces.Bread;
import com.eduardo.proyecto.interfaces.Filling;

public class FillingFactory extends AbstractFactory {
    @Override
    public Bread getBread(String bread) {
        return null;
    }

    @Override
    public Filling getFilling(String filling) {
        if(filling==null){
            return null;
        } else if (filling.equals("CHE")){
            return new Cheese();
        } else if (filling.equals("TOM")){
            return new Tomato();
        }
        return null;
    }
}
