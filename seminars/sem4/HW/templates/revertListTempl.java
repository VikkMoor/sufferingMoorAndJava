package sem4.HW.templates;

import java.util.LinkedList;

// To make the reverse LinkedList:

class revertListTempl {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> reversed = new LinkedList<>();
        for (Object o : ll) {
            reversed.addFirst(o);
        }
        return reversed;
    }


    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        // We can change this value and operator when check it in autotest:
        if (args.length == 0 || args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
            ll.add(3);
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        revertListTempl answer = new revertListTempl();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}