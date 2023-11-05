package sem1.lessonTasks;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = inputName.nextLine(); // Each step the scanner will read a new line (if text is
        // more than one line it will read one by one)
        System.out.printf("Hello, %s!", name);
    }
}