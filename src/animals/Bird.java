package animals;

import java.util.Objects;

public abstract class Bird extends Animal {

    private final String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = (habitat == null || habitat.isBlank()) ? "Earth" : habitat;
    }

    public abstract void hunts();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Bird{" +
                "habitat='" + habitat + '\'' +
                "} ";
    }

    public String getHabitat() {
        return habitat;
    }
}
