package sem2.lessonTasks;

public class beautyPalindrome {
    public static boolean isPalindrome(String input) {
        return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        boolean result = isPalindrome(input);
        System.out.println(input + ": " + result);
    }
}

