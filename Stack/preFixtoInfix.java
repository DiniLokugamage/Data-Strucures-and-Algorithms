import java.util.Stack;

class PrefixToInfixConverter {

    // Function to check if character is an operator or not     
    static boolean isOperator(char x) {
        switch(x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    // Convert prefix to infix expression 
    public static String convert(String str) {
        Stack<String> stack = new Stack<>();
        int l = str.length();

        // Reading from right to left 
        for(int i = l - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                // Check if the stack has enough operands
                if (stack.size() < 2) {
                    return "Invalid Prefix Expression"; // Handle stack underflow
                }
                
                String op1 = stack.pop();
                String op2 = stack.pop();
                
                // Concat the operands and operator 
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            } else {
                // To make character to string
                stack.push(c + ""); 
            }
        }
        // The final expression should be the only item in the stack
        if (stack.size() != 1) {
            return "Invalid Prefix Expression"; 
        }
        return stack.pop();
    }

    // Driver code
    public static void main(String[] args) {
        String exp = "+*AB/CD";  //prefix expression
        System.out.println("Infix : " + convert(exp)); //converted infix expression
    }
}
