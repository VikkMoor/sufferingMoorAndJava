package sem1.HW.readyMade;

//autotests calculator

import java.io.BufferedReader;

class Calculator {
    public double calculate(char op, int a, int b) {
        double res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) return - 1;
                else res = a / b;
                break;
        }
        return res;
    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // we can change these values and operator when check it in autotest:
            a = 7;
            op = '/';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        // Add the checking for correct operator:
        if (op != '+' && op != '/' && op != '-' && op != '*') {
            System.out.println("Unknown operator:" + op);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}