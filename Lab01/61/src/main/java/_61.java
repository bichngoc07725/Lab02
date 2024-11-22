/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane; 
public class _61 {
    public static void main(String[] args) {
    
    int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
    JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane. YES_OPTION?"Yes": "No"));
    System.exit(0);
    }
}
