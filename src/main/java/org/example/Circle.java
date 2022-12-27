package main.java.org.example;

public class Circle {
    private double r;
    private double s;
    private double p;
    public Circle(double r) {
        if(r>0) {
            this.r = r;
            this.s=Math.PI*r*r;
            this.p=2*Math.PI*r;
        }
        else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }
}
