package sem2.lessonTasks;

//Make the string with each unique symbol and how much of them

public class zip {
    public static void main(String[] args) {
        String s = "aaaaabbbcddeee";

        System.out.println(zipstr(s));
    }

    static String zipstr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        char cur = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == cur) {
                count++;
            } else {
                stringBuilder.append(cur);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
                cur = item;
            }
        }
        stringBuilder.append(cur);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }

}