package sem4.HW.templates;

import java.util.LinkedList;

/*
 In the class 'MyQueue' make next methods with LinkedList:
  - enqueue() - put the element to the end;
  - dequeue() - return the 1st element and delete it;
  - first() - return the 1st element without deleting;
  - getElements() - return all elements;
*/

class MyQueueTempl<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueueTempl() {
    }

    public MyQueueTempl(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void enqueue(T element){
        elements.add(element);
    }

    public T dequeue(){
        T first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public T first(){
        return elements.getFirst();
    }

    public LinkedList<T> getElements() {
        return elements;
    }

    // Dunno for what this part of code in template solution (str 42-44):
    // public void setElements(LinkedList<T> elements) {
    //    this.elements = elements;
    // }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        MyQueueTempl<Integer> queue;
        queue = new MyQueueTempl<>();

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(14);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}