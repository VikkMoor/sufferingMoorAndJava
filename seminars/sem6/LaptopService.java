package sem6;

import java.util.HashSet;
import java.util.Set;

public class LaptopService {
    // metods of searching of laptops depends on parameters
    private Set<Laptop> laptops;

    public LaptopService() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In the laptops ");
        sb.append(laptops.size());
        sb.append(" objects: \n");
        for (Laptop laptop : laptops) {
            sb.append(laptop);
            sb.append("\n");
        }
        return sb.toString();
    }
}
