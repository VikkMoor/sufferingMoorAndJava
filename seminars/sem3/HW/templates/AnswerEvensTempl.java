package sem3.HW.templates;

import java.util.Arrays;
import java.util.ArrayList;

// Method for remove even numbers from list:

class AnswerEvensTempl {
    public static void removeEvenNumbers(Integer[] arr) {

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {
                ints.remove(i);
                i--;
            }
        }
        System.out.println(ints);
    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 31, 100, 29};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        AnswerEvensTempl ans = new AnswerEvensTempl();
        ans.removeEvenNumbers(arr);
    }
}