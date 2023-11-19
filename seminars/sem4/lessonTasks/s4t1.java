package sem4.lessonTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
    Receives a string of the form like: "text~num".
    Need to split the string by ~, save text's part into a linked list at position num.
    If print~num is entered, prints the string at position num in the linked list
    and removes it from the list.
 */

public class s4t1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {

            String line = scan.nextLine();
            String text = line.split("~")[0];
            int num = Integer.parseInt(line.split("~")[1]);

            if (text.equals("print")) {
                String str = list.remove(num);
                System.out.println("Got and removed: " + str); // for example: rrr~0, trt~1, wfwfw~2, print~1 ("trt" will be deleted)
                                                               // number's part must be started with '0'.
            } else {
                list.add(num, text);
            }
        }
    }
}
