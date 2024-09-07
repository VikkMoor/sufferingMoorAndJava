package sem6;

import java.util.Objects;

public class Laptop {
    private String os;
    private Integer ram;
    private String color;

    public Laptop(String os, Integer ram, String color) {
        this.os = os;
        this.ram = ram;
        this.color = color;
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
        return "Laptop{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getOs(), laptop.getOs()) && Objects.equals(getRam(), laptop.getRam()) && Objects.equals(getColor(), laptop.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOs(), getRam(), getColor());
    }
}
