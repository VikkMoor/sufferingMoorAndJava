package sem4.HW.readyMade;

import java.util.ArrayDeque;
import java.util.Deque;

// Like in first seminar, but make it possible to undo the last operation
//  and show the result of previous.

class Calculator {

    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
       Double c = Double.valueOf(a);
       Double d = Double.valueOf(b);
      
        switch (op) {
            case '+':
                resultsStack.add(c + d);
                break;
            case '-':
                resultsStack.add(c - d);
                break;
            case '*':
                resultsStack.add(c * d);
                break;
            case '/':
                resultsStack.add(c / d);
                break;
            case '<':
                resultsStack.removeLast();
                break;
            default:
                System.out.println("Некорректный оператор: 'оператор'");
                break;
        }
        return resultsStack.getLast();

    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
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
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
