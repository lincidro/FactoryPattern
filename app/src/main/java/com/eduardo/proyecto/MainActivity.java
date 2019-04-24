package com.eduardo.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.eduardo.proyecto.Factory.Abstract.AbstractFactory;
import com.eduardo.proyecto.Factory.BreadFactory;
import com.eduardo.proyecto.Factory.FactoryGenerator;
import com.eduardo.proyecto.interfaces.Bread;
import com.eduardo.proyecto.interfaces.Filling;

public class MainActivity extends AppCompatActivity {

    public static String DEBUG_TAG="Debugging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView;
        mTextView = findViewById(R.id.text_view);

        BreadFactory breadFactory = new BreadFactory();
        Bread baguette = breadFactory.getBread("BRI");

        mTextView.setText("");
        mTextView.setText(
                new StringBuilder()
                .append(baguette.name())
                .append(" ")
                .append(baguette.calories())
                .toString()
        );

        AbstractFactory abstractFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = abstractFactory.getFilling("CHE");
        Log.d(DEBUG_TAG,filling.name()+" "+filling.calories());

        AbstractFactory abstractFactoryBread = FactoryGenerator.getFactory("BRE");
        Bread bread = abstractFactoryBread.getBread("BRI");
        Log.d(DEBUG_TAG,bread.name()+" "+bread.calories());

    }
}
