package sem4.lessonTasks;

/* 1. Write a method to put an array of elements on the stack and output its contents to the console;
   2. Same with queue.
*/

import java.util.Arrays;
import java.util.Stack;

public class s4t3 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        printStack(arr);

        System.out.println("Meow");
    }

    static void printStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);   - print not LIFO;
        while (!stack.empty()){
            System.out.println(stack.pop());  // 'pop' is for getting and deleting last element;
        }
    }
}
