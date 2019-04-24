package com.eduardo.proyecto.Factory.Abstract;

import com.eduardo.proyecto.interfaces.Bread;
import com.eduardo.proyecto.interfaces.Drink;
import com.eduardo.proyecto.interfaces.Filling;

public abstract class AbstractFactory {
    public abstract Bread getBread(String bread);
    public abstract Filling getFilling(String filling);
    public abstract Drink getDrink(String drink);
}
