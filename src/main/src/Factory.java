import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factory{

    public static void FactoryMethod(int metodo, ArrayList<String> Arr){
        if (metodo == 1){
            Vector newStack = new Vector();
            newStack.solveVector(Arr);
        }
        else if (metodo == 2){
            UVGStackL newStack = new UVGStackL();
        }
        else if (metodo == 3){
            UVGStackAL newStack = new UVGStackAL();
        }
    }

}
