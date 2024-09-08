package sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LaptopService {
    private Set<Laptop> laptops;

    public LaptopService() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public List<Laptop> filterLaptops(Set<String> criteria) {
        List<Laptop> result = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean matchesAll = true;
            for (String criterion : criteria) {
                String lowerCaseCriterion = criterion.toLowerCase();
                boolean matchesCriterion = laptop.getName().toLowerCase().contains(lowerCaseCriterion) ||
                        laptop.getOs().toLowerCase().contains(lowerCaseCriterion) ||
                        laptop.getRam().toString().contains(lowerCaseCriterion) ||
                        laptop.getColor().toLowerCase().contains(lowerCaseCriterion);

                // Если хотя бы один критерий не совпадает, ноутбук не удовлетворяет всем критериям
                if (!matchesCriterion) {
                    matchesAll = false;
                    break;
                }
            }
            if (matchesAll) {
                result.add(laptop);
            }
        }

        // Just for lil debuging:
        //System.out.println("Filter criteria: " + criteria);
        //System.out.println("Laptops found: " + result);
        return result;
    }

    public Set<Laptop> getLaptops() {
        return laptops;
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
