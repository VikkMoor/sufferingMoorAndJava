package sem1.lessonTasks;

//Move all given equal numbers to the end of the array

import java.util.Arrays;

public class equalToEnd2 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3,6,3,5645,7,9,111};
        int val = 3;
        int[] res = sort(arr, val);
        System.out.println(Arrays.toString(res));
    }

    static int[] sort(int[] arr, int val){
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}
