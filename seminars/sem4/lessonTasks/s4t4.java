package sem4.lessonTasks;

/* Make a stack using an array.
   Have to write methods:
   size(), empty(), peek(), pop().
*/


public class s4t4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
