package Exe1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PatientTest {
    public static void main(String[] args) {

        //prompt user to enter information
        String patientID = JOptionPane.showInputDialog("Please enter patient ID: ");
        String patientFirstName=JOptionPane.showInputDialog("Please enter patient's first name: ");
        String patientLastName = JOptionPane.showInputDialog("Please enter patient's last name: ");
        String address = JOptionPane.showInputDialog("Please enter address: ");
        String city = JOptionPane.showInputDialog("Please enter city: ");
        String province = JOptionPane.showInputDialog("Please enter province: ");
        String postalCode = JOptionPane.showInputDialog("Please enter the postal code");

        //new object creation
        Patient patient1= new Patient (patientID, patientFirstName, patientLastName, address, city, province, postalCode);

        //create a custom message
        String message=String.format("Hi, %s %s", patient1.getFirstName(), patient1.getLastName());
        JOptionPane.showMessageDialog(null, message);

        String message1=patient1.getPatientInfo();
        JOptionPane.showMessageDialog(null, message1);

    }
}

