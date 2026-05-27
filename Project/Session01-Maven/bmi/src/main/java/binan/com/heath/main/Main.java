package binan.com.heath.main;

import binan.com.heath.core.BmiCalculator;

public class Main {
    static void main() {
        //GỌI HÀM TỪ CLASS
        double bmi = BmiCalculator.getBmi(1.7, 70);
        //Main main = new Main();
        System.out.println("BMI: " + bmi);
    }

}
