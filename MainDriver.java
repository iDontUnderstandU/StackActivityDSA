import java.util.*;

public class MainDriver {
    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        System.out.print("Enter a string of braces: "); //the user inputs a string of braces
        String expression = con.next().trim();
        System.out.println("\n" + expression + " => "+ isBalanced(expression)); //calls the function that check if it is balanced
    }

    public static boolean isBalanced(String expression) {
        Stack stack = new Stack(); //declared stack as a new Object Stack
        if ((expression.length() % 2) == 1){
            return false;} //returns this if the user inputs only 3 characters
        else {
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i); //iterates to contain each character in the string
                switch (c) {
                    case '{':
                        stack.push('}');
                        break;
                    case '(':
                        stack.push(')');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    default:
                        if (stack.isEmpty() || c != stack.peek()) {
                            return false;
                        }
                        stack.pop();
                }
            }
            return stack.isEmpty();
            
        }
    }
}
