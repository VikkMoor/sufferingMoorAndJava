package sem3.HW.readyMade;

import java.util.Arrays;
import java.util.ArrayList;

// To sort list and to find min/max/average;

class analyzeNums {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int temp : arr){
            arrayList.add(temp);
        }
        arrayList.sort(null);
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);

        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average / arrayList.size();

        System.out.println(arrayList);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);

    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9, 11, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNums ans = new analyzeNums();
        ans.analyzeNumbers(arr);
    }
}