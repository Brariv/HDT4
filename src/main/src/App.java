import java.util.Scanner;

public class App {

    

    public static void runApp(){
        
        
        System.out.println("ingrese el nombre del archivo:");
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        Txtreader txtreader = new Txtreader();
        System.out.println(txtreader.readTxTFile(filename));
        System.out.println("Seleccione el metodo que desea usar: \n 1. Vector \n 2. List \n 3. ArrayList");
        int metodo = sc.nextInt();
        
        Factory.FactoryMethod(metodo, txtreader.readTxTFile(filename));
        
    }
}