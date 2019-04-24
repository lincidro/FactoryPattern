package com.eduardo.proyecto.Factory;

import com.eduardo.proyecto.Factory.Abstract.AbstractFactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }

        if(factory.equals("BRE")){
            return new BreadFactory();
        } else if(factory.equals("FIL")){
            return new FillingFactory();
        }
        return null;
    }
}
