package sem1.lessonTasks;

// Raise number 'a' to the power 'b'

public class pow {
    public static void main(String[] args) {
        int a = 2;
        int b = -4;
        System.out.println(pow(a, b));
    }

    static double pow(int a, int b){
        if (b == 0){
            return 1;
        }
        if (a == 0 || b == 1){
            return a;
        }
        double a1 = a;
        if (b < 0){
            a1 = 1 / a1;  // in order for working "for" loop below
            b = -b;       // correctly with a negative 'b' too
        }
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a1;
        }
        return res;
    }
}
