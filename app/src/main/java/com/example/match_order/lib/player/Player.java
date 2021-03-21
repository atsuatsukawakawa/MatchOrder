package com.example.match_order.lib.player;

public class Player {
    public static final int BACK_POSITION = 0;
    public static final int FORWARD_POSITION = 1;

    private int m_player ;
    private String m_player_name ;
    private int m_position;

    public Player(int id, String name ,int position){
        m_player= id;
        m_player_name = name;
        m_position = position;
    }
    public int getPlayerID(){
        return m_player;
    }
    public String getPlayerName(){
        return m_player_name;
    }
}
