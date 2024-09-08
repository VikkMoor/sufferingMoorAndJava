package sem6;

public class Main {
    public static void main(String[] args) {

        LaptopService laptops = testService();
        System.out.println(laptops);


        //ConsoleUI ui = new ConsoleUI();
        //ui.run();

    }

    static LaptopService testService() {
        LaptopService laptops = new LaptopService();

        Laptop laptop1 = new Laptop("dell", "Linux", 16, "black");
        Laptop laptop2 = new Laptop("asus", "Windows", 8, "white");
        Laptop laptop3 = new Laptop("lenovo", "Windows", 16, "black");
        Laptop laptop4 = new Laptop("apple", "MacOS", 8, "light blue");
        Laptop laptop5 = new Laptop("acer", "Linux", 8, "Silver");

        laptops.addLaptop(laptop1);
        laptops.addLaptop(laptop2);
        laptops.addLaptop(laptop3);
        laptops.addLaptop(laptop4);
        laptops.addLaptop(laptop5);

        return laptops;
    }
}
