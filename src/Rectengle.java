import java.util.Objects;

public class Rectengle  extends Shape {
    private int sideA = 0;
    private int sideB = 0;

    public Rectengle() {}
    public Rectengle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Rectengle(int sideA, int sideB, String color) {
        super(color);

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        Rectengle rect = (Rectengle) o;
        if (this.sideA == rect.sideA && this.sideB == rect.sideB) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
}
