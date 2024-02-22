package com.example;
import java.util.ArrayList;

public class Factory{

    public static String FactoryMethod(int metodo, ArrayList<String> Arr){
        if (metodo == 1){
            SolveV newSolve = new SolveV();
            String Result = newSolve.solve(Arr);
            return Result;
        }
        else if (metodo == 2){
            SolveL newSolve = new SolveL();
            String Result = newSolve.solve(Arr);
            return Result;
        }
        else if (metodo == 3){
            SolveA newSolve = new SolveA();
            String Result = newSolve.solve(Arr);
            return Result;
        } else{
            return "Error";
        }
    }

}
