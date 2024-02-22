package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    

    public static void runApp(){
        
        
        System.out.println("ingrese el path del archivo:");
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        Txtreader txtreader = new Txtreader();

        ArrayList<String> infix = txtreader.readTxTFile(path);
        ArrayList<String> postfix = Infix.infixToPostfixa(infix);
        System.out.println("Seleccione el metodo que desea usar: \n 1. Vector \n 2. List \n 3. ArrayList");
        int metodo = sc.nextInt();
        
        String Result = Factory.FactoryMethod(metodo, postfix);
        System.out.println("El resultado es: "+Result);
    }
}