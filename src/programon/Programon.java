/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programon;
import javax.swing.JFrame;
/**
 *
 * @author RotiCanai
 */
public class Programon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //A window to select game mode
        modeselect game = new modeselect(); //refers to modeselect class
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closes the window when X is pressed
        game.setLocationRelativeTo(null); //window opens at the center
        game.setSize(300,100); //window size
        game.setResizable(false); //cannot resize
        game.setVisible(true); //opens the window
        
    }
    
}
