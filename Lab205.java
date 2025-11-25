import javax.swing.*;
import java.util.Scanner;

public class Lab205 {
    public static void main(String[] args) {

        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Input minutes:"));

        int hours = minutes / 60;
        int remining = minutes % 60;

        JOptionPane.showMessageDialog(null,minutes +" minutes is "+hours+" hour "+remining+" minute");
    }
}
