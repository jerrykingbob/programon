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
public class pokemon { //Only a template. Can be edited to fit with the algoritm
    private String name;
    private String type;
    private int level;
    private int HP;
    private static String[] moves;

    public pokemon(String name, String type, int level, int HP, String[] moves) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.HP = HP;
        this.moves = moves;
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

    public static String[] getMoves() {
        return moves;
    }
    
    
}

