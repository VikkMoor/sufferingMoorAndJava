package sem6;

public class Main {
    public static void main(String[] args) {

        LaptopService test = testService();

        // This part just for checking:
        System.out.println(test);
        //for (Laptop laptop : test.getLaptops()) {
        //    System.out.println(laptop.getOs());
        //}


        ConsoleUI ui = new ConsoleUI();
        ui.setLaptopService(test);
        ui.run();

    }

    static LaptopService testService() {
        LaptopService laptops = new LaptopService();

        laptops.addLaptop(new Laptop("dell", "Linux", 16, "black"));
        laptops.addLaptop(new Laptop("asus", "Windows", 8, "white"));
        laptops.addLaptop(new Laptop("lenovo", "Windows", 16, "black"));
        laptops.addLaptop(new Laptop("apple", "MacOS", 8, "light blue"));
        laptops.addLaptop(new Laptop("acer", "Linux", 8, "Silver"));

        return laptops;
    }
}
