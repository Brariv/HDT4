package com.example;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Infix {

    public static ArrayList<String> infixToPostfixa(ArrayList<String> infix) {
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<String> simbols = new ArrayList<String>();
        ArrayList<String> postfix = new ArrayList<String>();
        for (int i = 0; i < infix.size(); i++) {
            if (infix.get(i).equals(")")) {
                postfix.addAll(numbers);
                postfix.addAll(simbols);
                numbers.clear();
                simbols.clear();
            } else if (infix.get(i).equals("+") || infix.get(i).equals("-") || infix.get(i).equals("*") || infix.get(i).equals("/")) {
                simbols.add(0, infix.get(i));
            } else if (infix.get(i).matches("[0-9]+")) {
                numbers.add(infix.get(i));
            } else {
                continue;
            }
        }
        postfix.addAll(numbers);
        postfix.addAll(simbols);
        return postfix;
    }
}