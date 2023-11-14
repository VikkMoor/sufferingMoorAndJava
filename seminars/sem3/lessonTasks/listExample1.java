package sem3.lessonTasks;

// Fill and sort array

import java.util.*;
import java.util.List;


public class listExample1 {
    public static void main(String[] args) {

        List<Integer> a = masRandom(10, 1, 9);
        System.out.println(a);
        a.sort(null);
        System.out.println(a);

    }

    public static List<Integer> masRandom(int count, int min, int max){

        List<Integer> mas = new ArrayList<>(count);
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            mas.add(rand.nextInt(min, max+1));
        }
        return mas;
    }
}