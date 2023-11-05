package sem1.HW.readyMade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufreadtest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
