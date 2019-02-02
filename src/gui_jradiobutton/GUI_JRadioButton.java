/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_jradiobutton;
import javax.swing.JFrame;
/**
 *
 * @author Qandeel
 */
public class GUI_JRadioButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       radioButtonClass rc = new radioButtonClass();
       rc.setSize(300,200);
       rc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       rc.setVisible(true);
       rc.setLocationRelativeTo(null);
    }
    
}
