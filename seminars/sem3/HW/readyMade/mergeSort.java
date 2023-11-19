package sem3.HW.readyMade;

import java.util.Arrays;

class mergeSort {
    public static int[] needToMerge(int[] a) {

        if (a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        left = needToMerge(left);
        right = needToMerge(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;


    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // We can change this parameters in autotests:
            a = new int[]{5, 21, 6, 2, 3, 4, 10, 1};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        mergeSort answer = new mergeSort();
        String itresume_res = Arrays.toString(answer.needToMerge(a));
        System.out.println(itresume_res);
    }
}