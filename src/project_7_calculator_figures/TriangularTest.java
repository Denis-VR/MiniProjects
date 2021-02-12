package project_7_calculator_figures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangularTest {
    public Triangular triag3_4_5;
    public Triangular triag8_12_10;

    @Before
    public void setUp() throws Exception {
        triag3_4_5 = new Triangular(3, 4, 5);
        triag8_12_10 = new Triangular(8, 12, 10);
    }

    @Test
    public void getSquareOfTriag3_4_5() {
        double square = triag3_4_5.getSquare();
        assertEquals(6, square, 0.00001);
    }

    @Test
    public void getPerimetеrOfTriag3_4_5() {
        double perimeter = triag3_4_5.getPerimetеr();
        assertEquals(6, perimeter, 0.00001);
    }

    @Test
    public void getSquareOfTriag8_12_10() {
        double square = triag8_12_10.getSquare();
        assertEquals(39.6862, square, 0.001);
    }

    @Test
    public void getPerimetеrOfTriag8_12_10() {
        double perimeter = triag8_12_10.getPerimetеr();
        assertEquals(15, perimeter, 0.00001);
    }


}