package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = b*b -4*a*c;
        return delta;
    }
    public double getRoot1() {
        double root1;
        if (getDiscriminant() >= 0) {
            root1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
            return root1;
        } else return 0;
    }
    public double getRoot2() {
        double root2;
        if (getDiscriminant() >= 0) {
            root2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
            return root2;
        } else return 0;
    }
    public void equation() {
        if (getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt " + getRoot1() + " và " + getRoot2());
        } else  if (getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm là: " + getRoot2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
