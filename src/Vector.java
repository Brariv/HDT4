import java.util.ArrayList;

public class Vector {
    

    static DevelopedStack newStack = new DevelopedStack();

    public static String solveVector(ArrayList<String> Arr){
        int Error = 0;
        for (String elemento : Arr) {
            newStack.push(elemento);
            
        }
        


        
        if (newStack.isEmpty()){
            System.out.println("Error: La pila esta vacia");
            Error = 1;
        }else if (newStack.size() == 1){
            System.out.println("Error: Formato");
            Error = 1;
        }else{
            int tamano = newStack.size();
            int contador = 0;
            while (tamano != 1){
                
                contador = newStack.size();
                for (int i = 0; i < newStack.size(); i++) {
                    if(i+3 > newStack.size()){
                        break;
                    }
                    
                    if (newStack.getIndex(i).toString().matches("[0-9]+") && newStack.getIndex(i+1).toString().matches("[0-9]+") && newStack.getIndex(i+2).toString().matches("[+,-,*,/]")){
                        int num1 = Integer.parseInt(newStack.getIndex(i).toString());
                        int num2 = Integer.parseInt(newStack.getIndex(i+1).toString());
                        String oper = newStack.getIndex(i+2).toString();
                        String result = calcular(oper, num1, num2);
                        if (result.equals("Error")){
                            System.out.println("Error: Division por 0");
                            Error = 1;
                            break;
                        }else {
                            newStack.pop(i+2);
                            newStack.pop(i+1);
                            newStack.replace(i, result);
                        }
                    } 
                }
                
                if (contador == newStack.size()){
                    System.out.println("Error: Formato");
                    Error = 1;
                    break;
                }
                tamano = newStack.size();
                
                
            }
            
        }
        if (Error == 0){
            return(newStack.top().toString());
        }else{
            return("Error");
        }
    }
    
    
    private static String calcular(String oper, int num1, int num2){ // if divided by 0, it will return Error
        String results = "";
        int result = 0;
        if (oper.equals("/")&&num2==0){
            results = "Error";
        } else {
            switch (oper) {
                case "+":
                    result = num1 + num2;
                    results = Integer.toString(result);
                    break;
                case "-":
                    result = num1 - num2;
                    results = Integer.toString(result);
                    break;
                case "*":
                    result = num1 * num2;
                    results = Integer.toString(result);
                    break;
                case "/":
                    result = num1 / num2;
                    results = Integer.toString(result);
                    break;
                default:
                    break;
            }
        
        }
        
        return (results);
    }
    }

