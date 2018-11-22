/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programon;

/**
 *
 * @author RotiCanai
 */
public class pokemon {
    private String name;
    private String type;
    private int level;
    private int HP;
    private String move1;
    private String move2;

    public pokemon(String name, String type, int level, int HP, String move1, String move2) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.HP = HP;
        this.move1 = move1;
        this.move2 = move2;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    public String getMove1() {
        return move1;
    }

    public String getMove2() {
        return move2;
    }
    
    
}

