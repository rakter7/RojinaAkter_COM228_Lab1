package Exe3;

import javax.swing.JOptionPane;
import java.util.Locale;


public class GameObjectTest {
    public static void main(String[] args) {
        //prompt user to enter data
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the x axis: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the y axis: "));
        double velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the velocity: "));
        String state = JOptionPane.showInputDialog("Enter the state of the object (dead/alive): ");
        String rotation = JOptionPane.showInputDialog("Does the object rotate(yes/no): ");

        //creating an object
        GameObject object1 = new GameObject(x, y, velocity, state, rotation);

        //displaying information
        String message = object1.getGameObjectInfo();
        JOptionPane.showMessageDialog(null, message);

        //to update new object
        String choice;
        do {
            choice = JOptionPane.showInputDialog("To create a new object press y and press x to exit.");
            switch (choice.toLowerCase()) {
                case "y": {

                    object1.setX(Double.parseDouble(JOptionPane.showInputDialog("New x axis: ")));
                    object1.setY(Double.parseDouble(JOptionPane.showInputDialog("New y axis: ")));
                    object1.setVelocity(Double.parseDouble(JOptionPane.showInputDialog("Enter the new velocity")));
                    object1.setState(JOptionPane.showInputDialog("Enter the new state (dead/alive)"));
                    object1.setRotation(JOptionPane.showInputDialog("Enter the new rotation (yes/no)"));
                    String message1 = object1.getGameObjectInfo();
                    JOptionPane.showMessageDialog(null, message1);
                }
                break;
                case "x":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Wrong selection");
                    break;
            }
        } while (!choice.toLowerCase().equals("x"));

    }
}
