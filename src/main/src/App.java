import java.util.Scanner;

public class App {

    

    public static void runApp(){
        
        int Error = 0;
        System.out.println("ingrese el nombre del archivo:");
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        Txtreader txtreader = new Txtreader();
        System.out.println(txtreader.readTxTFile(filename));
        
    }
}