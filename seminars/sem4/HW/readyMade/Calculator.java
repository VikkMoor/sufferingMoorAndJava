package sem4.HW.readyMade;

import java.util.ArrayDeque;
import java.util.Deque;

// Like in first seminar, but make it possible to undo the last operation
//  and show the result of previous.

class Calculator {

    private Deque<Integer> deque;

    public Calculator() {
        deque = new ArrayDeque<>();
    }

    public int calculate(char op, int a, int b) {

        switch (op) {
            case '+':
                deque.add(a + b);
                break;
            case '-':
                deque.add(a - b);
                break;
            case '*':
                deque.add(a * b);
                break;
            case '/':
                deque.add(a / b);
                break;
            case '<':
                deque.removeLast();
                break;
            default:
                System.out.println("Uncorrect operator: '" + op + "'");
                break;
        }
        return deque.getLast();

    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            a = 3;
            op = '*';
            b = 7;
            c = 4;
            op2 = '+';
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

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}