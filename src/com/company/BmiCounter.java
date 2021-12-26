package com.company;

public class BmiCounter {
    private Double BMI;

    public BmiCounter(Double masa, Double wzrost){
        this.BMI = masa / (wzrost * wzrost);
    }

    public void showBMI(){
        System.out.println("Your BMI: "+ BMI);
    }
}
