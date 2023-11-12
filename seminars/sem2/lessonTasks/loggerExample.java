package sem2.lessonTasks;

//examples

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(loggerExample.class.getName());
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            // FileWriter fileWriter = new FileWriter("text.txt"); - try-with-resources warning with this ;)
            fileWriter.write("hello");
            fileWriter.flush(); // to close writer - is useful and important! this method will remove all the
                                // data present inside the writer.
        } catch (IOException e) {
            e.printStackTrace();

        }

        try {
            // Create a 'FileHandler', specifying the path to the file and the maximum file size (in bytes)
            FileHandler fileHandler = new FileHandler("mylog.txt");

            // Setting up message format:
            fileHandler.setFormatter(new SimpleFormatter());

            // Installing 'FileHandler' as a handler for the logger:
            logger.addHandler(fileHandler);

            // Set the logging level (for example, ALL, INFO, WARNING, SEVERE, etc):
            logger.setLevel(Level.ALL);

// Examples:
            logger.info("This is an informational message.");
            logger.warning("This is a warning message.");
            logger.severe("This is a severe error message.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriterTest = new FileWriter("text2.txt")) {
            //FileWriter fileWriterTest = new FileWriter("text2.txt"); - try-with-resources warning with this ;)
            for (int i = 0; i < 100; i++) fileWriterTest.write("TEST");
            fileWriterTest.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}