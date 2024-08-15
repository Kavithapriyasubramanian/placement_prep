// import java.util.*;

// class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int output = cal(s);
//         System.out.println(output);
//     }

//     public static int cal(String s) {
//         int sign = 1;
//         int sum = 0;
//         int num = 0; // Initialize num
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c >= '0' && c <= '9') {
//                 num = 0; // Reset num
//                 while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    
//                     num = num * 10 + (s.charAt(i) - '0');
//                     i++;
//                 }
//                 i--;
//                 sum += num * sign;
//             } else if (c == '+') {
//                 sign = 1;
//             } else if (c == '-') {
//                 sign = -1;
//             } else if (c == '(') {
//                 st.push(sum);
//                 st.push(sign);
//                 sum = 0;
//                 sign = 1;
//             } else if (c == ')') {
//                 sum = sum * st.pop();
//                 sum += st.pop();
//             }
//         }
//         return sum;
//     }
// }
import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {

    // Helper function to perform arithmetic operations
    private static int performOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    // Helper function to determine precedence of operators
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return 0;
        }
    }

    // Function to evaluate the expression
    public static int evaluateExpression(String expr) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                numStack.push(num);
            } else {
                while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(ch)) {
                    int b = numStack.pop();
                    int a = numStack.pop();
                    char op = opStack.pop();
                    numStack.push(performOperation(a, b, op));
                }
                opStack.push(ch);
                i++;
            }
        }

        while (!opStack.isEmpty()) {
            int b = numStack.pop();
            int a = numStack.pop();
            char op = opStack.pop();
            numStack.push(performOperation(a, b, op));
        }

        return numStack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the length of the string (optional, to match the input format)
        int length = Integer.parseInt(scanner.nextLine().trim());

        // Reading the expression
        String expr = scanner.nextLine().trim();

        // Evaluating the expression
        int result = evaluateExpression(expr);

        // Printing the result
        System.out.println(result);

        scanner.close();
    }
}
