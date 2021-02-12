package project_7_calculator_figures;

public class Circle extends Figure {
    private double radius;

    @Override
    double getSquare() {
        return (Math.PI * (radius * radius));
    }

    @Override
    double getPerimetеr() {
        return (2 * Math.PI * radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
