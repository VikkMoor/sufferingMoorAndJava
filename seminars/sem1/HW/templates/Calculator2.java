package sem1.HW.templates;

//autotests calculator

class Calculator2 {
    public int calculate(char op, int a, int b) {
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
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
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



    public static void main(String[] args) {
        int a;
        char op;
        int b;

        if (args.length == 0) {
            // we can change these values and operator when check it in autotest:
            a = 7;
            op = '+';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator2 calculator = new Calculator2();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}