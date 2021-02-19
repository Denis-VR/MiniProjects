package project_8_colletionFramework;

import java.util.Objects;

public class CarOwner {
    private int id;
    private String name;
    private String lasName;

    public CarOwner(int id, String name, String lasName) {
        this.id = id;
        this.name = name;
        this.lasName = lasName;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarOwner carOwner = (CarOwner) o;
        return id == carOwner.id && Objects.equals(name, carOwner.name) && Objects.equals(lasName, carOwner.lasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lasName);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
