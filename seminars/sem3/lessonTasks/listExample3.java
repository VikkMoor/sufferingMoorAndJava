package sem3.lessonTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// To fill the list and remove integers (with iterator and with just .get)

public class listExample3 {
    public static void main(String[] args) {
        List list = listAdd();
        System.out.println(list);
        listRemoveIntIter(list);
        System.out.println(list);
    }

    public static void listRemoveIntIter(List list) {
        Iterator inter = list.iterator();
        while (inter.hasNext()) {
            if (inter.next() instanceof Integer) {
                inter.remove();
            }
        }
    }

    public static void listRemoveInt(List list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
    }

    public static List listAdd() {

        List list = new ArrayList();
        list.add(32);
        list.add(66);
        list.add("adfa");
        list.add("a");
        list.add(45);
        list.add("45");
        list.add(45.4);
        list.add('4');
        list.add(true);

        return list;
    }
}
