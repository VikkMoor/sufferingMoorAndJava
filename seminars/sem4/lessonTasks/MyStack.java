package sem4.lessonTasks;

public class MyStack {
    private String[] arr = new String[10];
    private int size = 0;

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        if (!empty()){
            stringBuilder.append(arr[size-1]);
            for (int i = size - 2; i >= 0 ; i--) {
                stringBuilder.append(", ");
                stringBuilder.append(arr[i]);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
