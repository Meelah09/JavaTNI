import javax.swing.*;
import java.util.Scanner;

public class Lab501 {
    public static double cal_bmi(double weight, double height_cm) {
        double height_m = height_cm / 100.0;

        return weight / (height_m * height_m);
    }
    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        while (true) {
            int select = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI?", "Check BMI",
                    JOptionPane.YES_NO_OPTION);

            if (select == JOptionPane.YES_OPTION) {
                String weightStr = JOptionPane.showInputDialog("Enter your weight (kg.):");
                double weight = Double.parseDouble(weightStr);

                String heightStr = JOptionPane.showInputDialog("Enter your height (cm.):");
                double height = Double.parseDouble(heightStr);

                double bmiResult = cal_bmi(weight, height);
                String status = check_bmi(bmiResult);

                String message = String.format("Your BMI = %.2f\nYour BMI result = %s", bmiResult, status);
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

    }
}


