package sem1.lessonTasks;

// Reverse words in a sentence

public class revsent {
    public static void main(String[] args) {
        String line = "Welcome to the java course";
        String[] words = line.split(" ");
        StringBuilder line2 = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            line2.append(words[i]);
            line2.append(" ");
        }
        System.out.println(line2.toString().trim());
    }
}
