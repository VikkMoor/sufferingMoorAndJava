package sem1.lessonTasks;

//Move all given equal numbers to the end of the array

import java.util.Arrays;

public class equalToEnd1 {
    public static void main(String[] args) {
        var array = new int[]{3, 2, 2, 3, 4, 35, 3, 24, 234, 4, 23, 52, 2, 2, 3, 3, 5, 6565, 3, 55, 3};
        var val = 3;

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == val && array[i + 1] != val) {
                    var temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}