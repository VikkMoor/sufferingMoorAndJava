package sem4.HW.readyMade;

import java.util.LinkedList;

/*
 In the class 'MyQueue' make next methods with LinkedList:
  - enqueue() - put the element to the end;
  - dequeue() - return the 1st element and delete it;
  - first() - return the 1st element without deleting;
  - getElements() - return all elements;
*/

class MyQueue<T> {

    private LinkedList<T> queue;
    public MyQueue(){
        queue = new LinkedList<>();
    }

    public void enqueue(T element){
        queue.addLast(element);
    }

    public T dequeue(){
        return queue.removeFirst();
    }

    public T first(){
        return queue.getFirst();
    }

    public LinkedList<T> getElements() {
        return new LinkedList<>(queue);
    }


    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // We can change this value and operator when check it in autotest:
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
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