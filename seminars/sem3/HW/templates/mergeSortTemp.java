package sem3.HW.templates;

import java.util.Arrays;

class mergeSortTemp {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4, 7, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        mergeSortTemp answer = new mergeSortTemp();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}