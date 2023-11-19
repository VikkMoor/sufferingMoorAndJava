package sem4.lessonTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Same task with lil changes from the teacher ('print' - just for print + 'revert' added)

public class s4t1teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine(); // enter just text;
            switch (line){
                case "print": // output texts LIFO
                    for (String s: list){
                        System.out.println(s);
                    }
                    break;
                case "revert": // the last entered text will be deleted (for example: one~0,
                    // two~1, three~2, four~3, print, revert, print - four will be deleted)
                    list.remove(0);
                    break;
                case "finish": // just finish ¯\_(ツ)_/¯
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}
