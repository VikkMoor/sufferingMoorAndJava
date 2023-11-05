package sem1.HW.readyMade;

//autotests calculator

class Calculator {
    public int calculate(char op, int a, int b) {
        int ans = 0;
        if (op == '+') {
            ans = a + b;
        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {
            ans = a * b;
        } else if (op == '/') {
            ans = a / b;
        } else {
            System.out.println("Unknown operator: '" + op + "'");
        }
        return ans;
    }


    public static void main(String[] args) {
        int a;
        char op;
        int b;

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

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}