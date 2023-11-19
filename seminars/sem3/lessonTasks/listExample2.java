package sem3.lessonTasks;
import java.util.ArrayList;
import java.util.Iterator;

// To fill the list and remove integers

public class listExample2 {
    public static void main(String[] args) {
        ArrayList<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");
        mixedList.add(42);
        mixedList.add("World");
        mixedList.add(123);
        mixedList.add("Java");
        mixedList.add(7);
        mixedList.add(7.5);
        System.out.println("The list before removing: ");
        System.out.println(mixedList);
        Iterator<Object> iterator = mixedList.iterator();
        while (iterator.hasNext()) {
            Object item = iterator.next();
            if (item instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println("The list after removing: ");
        System.out.println(mixedList);
    }
}

