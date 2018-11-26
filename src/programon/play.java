package programon;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author RotiCanai
 */
public class play extends JFrame{ //Incomplete
    /**
     * This class will be used to run the actual game.
    */
    private static JOptionPane frame;
    protected static String[] names;//Will be used in POKEMON JList in actionpanel class
    protected static String[] moves;//Will be used in ATTACK JList in actionpanel class
    protected static String[] items;//Will be used in BAG JList in actionpanel class
    
    public static void singleplayer(){
        //Single player code goes here
    }
    
    public static void multiplayer(){
        moves=pokemon.getMoves();
        actionpanel p1 = new actionpanel(1);
        actionpanel p2 = new actionpanel(2);
        //action disp = new displaypanel(); //Refers to a class that opens a window to display ongoing battle (not yet created)
        p1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int x1,x2,y;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle display = defaultScreen.getDefaultConfiguration().getBounds();
        
        x1=0;
        x2=(int) ((display.getMaxX()-p2.getWidth())*0.8);
        y=(int) ((display.getMaxY()-p1.getHeight())*0.6);
        
        p1.setLocation(x1,y);
        p2.setLocation(x2,y);
        p1.setSize(330,270);
        p2.setSize(330,270);
        p1.setResizable(false);
        p2.setResizable(false);
        p1.setVisible(true);
        p2.setVisible(true);
        //multiplayer code goes here
        try{
            Scanner s = new Scanner(new FileInputStream("pokemondata.txt"));
            //input goes here
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(frame, "File not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
