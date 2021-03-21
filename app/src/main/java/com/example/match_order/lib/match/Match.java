package com.example.match_order.lib.match;

import com.example.match_order.lib.player.Player;

public class Match {
    private int m_serial_no;
    private Player m_a_back;
    private Player m_a_forward;
    private Player m_b_back;
    private Player m_b_forward;
    private int m_a_score;
    private int m_b_score;

    public Match(int serialNo, Player a_back,Player a_forward,Player b_back,Player b_forward){
        m_serial_no = serialNo;
        m_a_back = a_back;
        m_a_forward =a_forward;
        m_b_back =b_back;
        m_b_forward =b_forward;
    }
    public int getMatchNo(){
        return m_serial_no;
    }
    public String toString(){
        return String.format("No.%2d   %d:%8s ×%d:%8s - %d:%8s × %d:%8s",
                m_serial_no,
                m_a_back.getPlayerID(),m_a_back.getPlayerName(),
                m_a_forward.getPlayerID(),m_a_forward.getPlayerName(),
                m_b_back.getPlayerID(),m_b_back.getPlayerName(),
                m_b_forward.getPlayerID(),m_b_forward.getPlayerName());
    }

    public void setScore(int a, int b){
        m_a_score = a;
        m_b_score = b;
    }
}
