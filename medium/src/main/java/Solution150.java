import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        for (String token : tokens) {
            if (operators.contains(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(calculate(left, right, token));
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    private int calculate(int first, int second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                throw new RuntimeException("unexpected!");
        }
    }
}
