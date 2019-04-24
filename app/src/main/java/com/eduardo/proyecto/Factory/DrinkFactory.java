package com.eduardo.proyecto.Factory;

import com.eduardo.proyecto.Factory.Abstract.AbstractFactory;
import com.eduardo.proyecto.interfaces.Bread;
import com.eduardo.proyecto.interfaces.Drink;
import com.eduardo.proyecto.interfaces.Filling;
import com.eduardo.proyecto.interfacesImpl.CubaLibre;

public class DrinkFactory extends AbstractFactory {

    @Override
    public Bread getBread(String bread) {
        return null;
    }

    @Override
    public Filling getFilling(String filling) {
        return null;
    }

    @Override
    public Drink getDrink(String drink) {
        if(drink==null){
            return null;
        }

        if(drink.equals("CL")){
            return new CubaLibre();
        }
        return null;
    }
}
