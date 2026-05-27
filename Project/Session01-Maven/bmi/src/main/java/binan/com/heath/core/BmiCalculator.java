package binan.com.heath.core;

public class BmiCalculator {
    public static double getBmi(double height, double weight){
        double bmi = weight / (height * height);
        return bmi;
    }
    public static void printBmi(){
        //tính Bmi = can nang (kg) / chieu cao (cm)^2
        // bmi < 18.0 ốm so với chiều cao
        // bmi < 24.9 chuẩn form
        double weight = 70, height = 1.7;
        double bmi = weight / (height * height);
        System.out.println("Your bmi (W: 70, H: 1.7): " + bmi);

    }

}
