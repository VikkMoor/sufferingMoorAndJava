package sem1.lessonTasks;

//Show the maximum number of digits "1" in a row in array

public class samenumsrow {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int max = 0;
        for (int j : binaryArray) {
            if (j == 1)
                count++;
            else if (count > max) {
                max = count;
                count = 0;
            }
        }
        System.out.println(Math.max(count, max));
    }
}
