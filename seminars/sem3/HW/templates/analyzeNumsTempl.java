package sem3.HW.templates;

import java.util.Arrays;
import java.util.ArrayList;

// To sort list and to find min/max/average;

class analyzeNumsTempl {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        ints.sort(Integer::compareTo); // sorting the list;
        System.out.println(ints); // output result to the screen;
        System.out.println("Minimum is " + ints.get(0)); // finding and showing min;
        System.out.println("Maximum is " + ints.get(ints.size()-1)); // same max;

        int sum = 0;
        for(int i : ints){ // sum of all elements;
            sum += i;
        }
        System.out.println("Average is = " + sum / ints.size()); // calc and show average;

    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            arr = new Integer[]{4, 2, 7, 5, 20, 1, 3, 8, 6, 9, 11, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumsTempl ans = new analyzeNumsTempl();
        ans.analyzeNumbers(arr);
    }
}