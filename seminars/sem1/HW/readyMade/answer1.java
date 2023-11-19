package sem1.HW.readyMade;

//autotests get triangle number

public class answer1 {
    public int countNTriangle(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            // we can change this value and operator when check it in autotest:
            n = 6;
        } else {
            n = Integer.parseInt(args[0]);
        }
        // Displaying the result on the screen in autotests:
        answer1 ans = new answer1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}