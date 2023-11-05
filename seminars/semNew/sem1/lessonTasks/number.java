package semNew.sem1.lessonTasks;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        System.out.println("Number + 5: " + (number + 5));
    }
}