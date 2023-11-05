package sem1.lessonTasks;

import java.time.LocalTime;
import java.util.Scanner;

public class nameHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's ur name? ");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Morning, " + name);
        } else if (hour >= 12 && hour < 18){
            System.out.println("Good day to you, " + name);
        } else if (hour >= 18 && hour < 23){
            System.out.println("Good evening, " + name);
        } else {
            System.out.println("It's too late, take your rest, " + name);
        }
    }
}