/*
This class is used to display a window that
prompts the player to choose between a battle
between the player and a computer (single player
or the player with another player (PvP).
*/
package programon;

/**
 *
 * @author RotiCanai
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class modeselect extends JFrame{
    private JLabel question;
    private JButton single;
    private JButton multi;
    
    public modeselect(){
        super("Mode Selection");
        setLayout(new FlowLayout());
        
        question = new JLabel("Which mode would you like to play in?");
        single = new JButton("Single Player");
        multi = new JButton("Multiplayer");
        add(question);
        add(single);
        add(multi);
        
        handler action = new handler();
        single.addActionListener(action);
        single.addActionListener(action);
    }
    
    private class handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String str ="";
            if(event.getSource()==single)
                play.singleplayer();
            else if(event.getSource()==multi)
                play.multiplayer();
        }
    }
}
