package animals;

import java.util.Objects;

public class Predator extends Mammal {

    private final String foodType;

    public Predator(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);
        this.foodType = (foodType == null || foodType.isBlank()) ? "grass" : foodType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats " + foodType);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps in " + getHabitat());
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves at the speed of " + getSpeed() + " km/h");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks in " + getHabitat());
    }

    public void hunts() {
        System.out.println(getName() + " hunts");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(foodType, predator.foodType);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Predator{" +
                "foodType='" + foodType + '\'' +
                "} ";
    }

    public String getFoodType() {
        return foodType;
    }
}
