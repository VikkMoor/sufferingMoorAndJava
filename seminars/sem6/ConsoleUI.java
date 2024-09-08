package sem6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);

    /* "dependency injection", allows the ConsoleUI to access the passed
    LaptopService instance to perform its tasks: */
    public void setLaptopService(LaptopService service) {
        this.service = service;
    }
    public void run() {
        while (true) {
            System.out.println("> Enter filtering criteria (comma-separated) or 'n' to exit: ");
            String param = scanner.nextLine();

            if (param.equals("n")) {
                System.exit(0);
            }

            String[] criteriaArray = param.split(",");
            Set<String> criteria = new HashSet<>();
            for (String c : criteriaArray) {
                criteria.add(c.trim());
            }

            // Фильтрация ноутбуков по критериям
            List<Laptop> foundLaptops = service.filterLaptops(criteria);
            if (foundLaptops.isEmpty()) {
                System.out.println("No laptops found matching the criteria.");
            } else {
                System.out.println("Found laptops:");
                for (Laptop laptop : foundLaptops) {
                    System.out.println(laptop);
                }
            }

            System.out.println("To try to search again? (y/n)");
            String tryAgain = scanner.nextLine();
            if (tryAgain.equals("n")) {
                System.exit(0);
            }
        }
    }
}

