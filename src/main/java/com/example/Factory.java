package com.example;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factory{

    public static String FactoryMethod(int metodo, ArrayList<String> Arr){
        if (metodo == 1){
            Vector newStack = new Vector();
            String Result = newStack.solveVector(Arr);
            return Result;
        }
        else if (metodo == 2){
            UVGStackL newStack = new UVGStackL();
        }
        else if (metodo == 3){
            UVGStackAL newStack = new UVGStackAL();
        }
    }

}
