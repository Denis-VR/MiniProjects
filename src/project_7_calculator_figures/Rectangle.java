package project_7_calculator_figures;

public class Rectangle extends Figure {
    private double AB;
    private double BC;
    private double CD;
    private double DA;


    @Override
    double getSquare() {
        return AB * BC;
    }

    @Override
    double getPerimetеr() {
        return AB + BC + CD + DA;
    }

    public Rectangle(double AB, double BC, double CD, double DA) {
        this.AB = AB;
        this.BC = BC;
        this.CD = CD;
        this.DA = DA;
    }
}
