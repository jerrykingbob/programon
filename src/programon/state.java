/*
 * This class manages the state at which changes the JList in the action window
 */
package programon;

/**
 *
 * @author User
 */
public class state extends play{
    private int state;
    
    public state() {
        state = 0;
    }

    public state(int x) {
        this.state = x;
    }

    public int getState() {
        return state;
    }
    
    public String[] pokemon(){
        return names;
    }
    
    public String[] bag(){
        return items;
    }
    
    public String[] attack(){
        return moves;
    }
}
