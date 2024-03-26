package sem4.lessonTasks;

public class MyStack {
    String[] arr = new String[10];
    int size = 0;

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(String item) {
        if (size >= arr.length) {
            String[] arr1 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[size++] = item;
    }

    String peek() {
        return arr[size-1];
    }

    String pop() {
        return arr[--size];
    }
}
