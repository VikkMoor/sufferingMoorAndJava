package sem4.lessonTasks;
/* 1. Measure the time it takes for 10000 (and then more) items to be added to ArrayList;
   2. Measure the time it takes for 10000 (and then more) items to be added to LinkedList;
   Try a few times and compare
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task1count {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(work(list1));
        System.out.println(work(list2));
    }

    private static long work(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //list.add(i); - adding to the end;
            list.add(0, i);   // rn adding element is to the beginning;
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
