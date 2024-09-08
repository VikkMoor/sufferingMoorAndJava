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
        StringBuilder sb = new StringBuilder();
        sb.append("Device Name: ");
        sb.append(name);
        sb.append(" (OS: ");
        sb.append(os);
        sb.append(", RAM: ");
        sb.append(ram);
        sb.append(", color: ");
        sb.append(color);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getName(), laptop.getName()) && Objects.equals(getOs(), laptop.getOs()) && Objects.equals(getRam(), laptop.getRam()) && Objects.equals(getColor(), laptop.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOs(), getRam(), getColor());
    }
}
