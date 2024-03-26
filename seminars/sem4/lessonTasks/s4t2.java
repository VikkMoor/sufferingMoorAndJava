package sem4.lessonTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
  Make the console application that:
  Receives strings from the user and 'remembers' them.
  If 'print' is entered, the string is output like LIFO.
  If 'revert' is entered, delete the previous text entered from memory.
 */

public class s4t2 {
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
                case "revert": // the last entered text will be deleted (for example: one,
                    // two, three, four, print, revert, print - four will be deleted)
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
