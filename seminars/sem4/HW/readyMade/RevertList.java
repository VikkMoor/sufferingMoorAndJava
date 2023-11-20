package sem4.HW.readyMade;

import java.util.LinkedList;

// To make the reverse LinkedList:

class RevertList {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> myList = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            myList.add(ll.get(i));
        }
        return (LinkedList<Object>) myList;
    }


    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // We can change this value and operator when check it in autotest:
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        RevertList answer = new RevertList();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}