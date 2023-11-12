package sem2.lessonTasks;

//Input even N (>0), symbols c1, c2.
// Method bout string c1c2c1c2...N

public class sem2task2 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 10;
        System.out.println(concat(c1, c2, n));
    }

    static String concat(char c1, char c2, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}