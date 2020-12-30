package assignment2;

import javax.swing.*;

public class Question13 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter any number ");
        int i = Integer.parseInt(input);
        if(i < 0) {
            JOptionPane.showMessageDialog(null, "The number is: " + i);
        }
        else{
            JOptionPane.showMessageDialog(null, "The number you entered is not negative");
        }
    }
}
