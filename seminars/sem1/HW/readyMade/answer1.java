package sem1.HW.readyMade;

//autotests get triangle number

public class answer1 {
    public int countNTriangle(int n) {
        int sum = 0;
        if (n < 0) return -1;
        else {
            for (int i = 1; i <= n; i++) sum += i;
            return sum;
        }
    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            // we can change this value and operator when check it in autotest:
            n = 6;
        } else {
            n = Integer.parseInt(args[0]);
        }

        answer1 ans = new answer1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}