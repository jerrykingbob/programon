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
    public static void main(String[] args) {
        modeselect game = new modeselect();
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        game.setSize(300,100);
        game.setResizable(false);
        game.setVisible(true);
        
    }
    
}
