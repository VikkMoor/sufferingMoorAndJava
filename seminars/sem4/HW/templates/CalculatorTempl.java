package sem4.HW.templates;

import java.util.ArrayDeque;
import java.util.Deque;

// Like in first seminar, but make it possible to undo the last operation
//  and show the result of previous.

class CalculatorTempl {
    public Deque<Integer> resultsStack = new ArrayDeque<>();
    public Deque<Character> operationsStack = new ArrayDeque<>();
    public int prevResult;

    public int calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            int result = performOperation(op, a, b);
            resultsStack.push(result);
            operationsStack.push(op);
            prevResult = result;
            return result;
        }
    }


    private int performOperation(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Zero Division Error");
        }
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }


    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '-';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        CalculatorTempl calculator = new CalculatorTempl();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}