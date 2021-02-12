package project_7_calculator_figures;

public class Triangular extends Figure {
    private double AB;
    private double BC;
    private double CA;

    public double perimeter;


    @Override
    double getSquare() {
        double Square = Math.sqrt(perimeter * (perimeter - AB) * (perimeter - BC) * (perimeter - CA));
        return Square;
    }

    @Override
    double getPerimetеr() {
        return perimeter;
    }

    public Triangular(double AB, double BC, double CA) {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
        perimeter = ((AB + BC + CA) / 2);
    }
}
