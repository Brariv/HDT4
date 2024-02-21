public class Infix {
    public void someMethod() {
            DevelopedStack newStack = new DevelopedStack();
            StringBuilder postfixExpression = new StringBuilder();
            while (!newStack.isEmpty()) {
                postfixExpression.insert(0, newStack.pop(0) + " ");
            }
            System.out.println("Expresión en formato postfix: " + postfixExpression.toString().trim());
        
    }
}