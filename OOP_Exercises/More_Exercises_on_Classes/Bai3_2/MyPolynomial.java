package More_Exercises_on_Classes.Bai3_2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;
    private int degree;


    public MyPolynomial(double[] coeffs, int degree) {
        this.coeffs = coeffs;
        this.degree = degree;
    }

    public int getDegree(){
        return degree;
    }

    @Override
    public String toString() {
        return "MyPolynomial{" +
                "coeffs=" + Arrays.toString(coeffs) +
                ", degree=" + degree +
                '}';
    }
}
