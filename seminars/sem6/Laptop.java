package sem6;

import java.util.Objects;

public class Laptop {
    private String name;
    private String os;
    private Integer ram;
    private String color;

    public Laptop(String name, String os, Integer ram, String color) {
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Device Name: " + name + " (OS: " + os + ", RAM: " + ram + ", color: " + color + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(name, laptop.name) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(ram, laptop.ram) &&
                Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, os, ram, color);
    }
}
