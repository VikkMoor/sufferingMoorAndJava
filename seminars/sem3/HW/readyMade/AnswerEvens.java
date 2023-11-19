package sem3.HW.readyMade;

import java.util.Arrays;
import java.util.ArrayList;

// Method for remove even numbers from list:

class AnswerEvens {
    public static void removeEvenNumbers(Integer[] arr) {

        ArrayList<Integer> buff = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                buff.add(arr[i]);
            }
        }
        System.out.println(buff);
    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 31};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        AnswerEvens ans = new AnswerEvens();
        ans.removeEvenNumbers(arr);
    }
}