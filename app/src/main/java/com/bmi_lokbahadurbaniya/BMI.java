package com.bmi_lokbahadurbaniya;

public class BMI {
    private double height,weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double BMIcalc(){
        double h = height/100;
        double res = weight/(h*h);
        return res;
    }

}
