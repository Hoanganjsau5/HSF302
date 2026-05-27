package binan.com;

import binan.com.heath.core.BmiCalculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double bmi = BmiCalculator.getBmi(1.7, 70);
        System.out.println(bmi);
    }
}
