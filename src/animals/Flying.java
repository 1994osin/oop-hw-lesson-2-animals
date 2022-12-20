package animals;

import java.util.Objects;

public class Flying extends Bird {

    private final String movementType;

    public Flying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = (movementType == null || movementType.isBlank()) ? "air" : movementType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps in " + getHabitat());
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves");
    }

    public void hunts() {
        System.out.println(getName() + " hunts");
    }

    public void fly() {
        System.out.println(getName() + " flies in " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Flying{" +
                "movementType='" + movementType + '\'' +
                "} ";
    }

    public String getMovementType() {
        return movementType;
    }
}
