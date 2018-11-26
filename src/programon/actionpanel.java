/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author User
 */
public class actionpanel extends JFrame{
    private JButton fight, bag, pokemon, run, select;
    private JList list;
    private int state=0;
    
    public actionpanel(int player){
        setLayout(new FlowLayout());
        state s = new state();
        if(player==1)
            setTitle("Player 1");
        else
            setTitle("Player 2");
        fight = new JButton("FIGHT");
        bag = new JButton("BAG");
        pokemon = new JButton("POKEMON");
        run = new JButton("RUN"); //run button will trigger a surrender, player automatically loses.
        select = new JButton("SELECT"); //used to select a different pokemon/items.
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.setPreferredSize(new Dimension(250, 150));
        scrollpane.setAlignmentX(LEFT_ALIGNMENT);
        if(state==1)
            list = new JList(s.attack());
        else if(state==2)
            list = new JList(s.bag());
        else if(state==3)
            list = new JList(s.pokemon());
        else
            list = new JList(s.empty());
        scrollpane.setViewportView(list);
        
        add(fight);
        add(bag);
        add(pokemon);
        add(run);
        add(scrollpane);
        add(list);
        add(select);
        
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        
        handler action = new handler();
        fight.addActionListener(action);
        bag.addActionListener(action);
        pokemon.addActionListener(action);
        run.addActionListener(action);
        select.addActionListener(action);
    }
    
    private class handler implements ActionListener{ //Subclass (class in a class)
        public void actionPerformed(ActionEvent event){ //what to do when either button is pressed
            if(event.getSource()==fight){
                state s = new state(1);
                state = s.getState();
            }
            else if(event.getSource()==bag){
                state s = new state(2);
                state = s.getState();
            }
            else if(event.getSource()==pokemon){
                state s = new state(3);
                state = s.getState();
            }
            else if(event.getSource()==run){
                state s = new state(2);
                state = s.getState();
            }
        }
    }
}
