package com.example.match_order.lib.match;

import com.example.match_order.lib.match.order.AbstractOrder;
import com.example.match_order.lib.match.order.Order10;
import com.example.match_order.lib.match.order.Order2;
import com.example.match_order.lib.match.order.Order3;
import com.example.match_order.lib.match.order.Order4;
import com.example.match_order.lib.match.order.Order5;
import com.example.match_order.lib.match.order.Order6;
import com.example.match_order.lib.match.order.Order7;
import com.example.match_order.lib.match.order.Order8;
import com.example.match_order.lib.error.MyException;
import com.example.match_order.lib.match.order.Order9;
import com.example.match_order.lib.player.Player;

import java.util.ArrayList;
import java.util.List;

public class MakeMatchOrder {
    List<Match> m_matchList = new ArrayList<Match>();
    List<String> m_stringList = new ArrayList<String>();
    List<Player> m_back_players = new ArrayList<Player>();
    List<Player> m_forward_players = new ArrayList<Player>();

    public MakeMatchOrder(int back, int forward ,String[] back_names,String[] forward_names) throws MyException {
        // プレイヤーの作成(後衛)
        for (int i = 0;i < back ;i++) m_back_players.add(new Player(i + 1,back_names[i],Player.BACK_POSITION));
        // プレイヤーの作成(後衛)
        for (int i = 0;i < forward ;i++) m_forward_players.add(new Player(i + 1,forward_names[i],Player.FORWARD_POSITION));

        AbstractOrder backOrder = makeOrder(back);
        AbstractOrder forwardOrder = makeOrder(forward);
        int[] backs_a = backOrder.getOrderAList();
        int[] backs_b = backOrder.getOrderBList();
        int[] forwards_a = forwardOrder.getOrderAList();
        int[] forwards_b = forwardOrder.getOrderBList();

        int mod_backs = backOrder.getOrderNum();
        int mod_forwards = forwardOrder.getMemberNum();

        m_stringList.add("試合順 後衛   ×   前衛 - 後衛   ×   前衛");
        int match_num = Math.max(backOrder.getOrderNum(), forwardOrder.getOrderNum());
        for(int i = 0; i< match_num; i++){

            Match match = new Match(i + 1, m_back_players.get(backs_a[i%mod_backs]-1),m_forward_players.get(forwards_a[i%mod_forwards]-1),m_back_players.get(backs_b[i%mod_backs]-1),m_forward_players.get(forwards_b[i%mod_forwards]-1));
            m_stringList.add(match.toString());
        }
    }
    public List<Match> getMatchOrderList(){
        return m_matchList;
    }
    public List<String> getMatchOrderListString(){
        return m_stringList;
    }
    AbstractOrder makeOrder(int memberNo) throws MyException {
        AbstractOrder order;
        switch (memberNo){
            case 2:
                order = new Order2();
                break;
            case 3:
                order = new Order3();
                break;
            case 4:
                order = new Order4();
                break;
            case 5:
                order = new Order5();
                break;
            case 6:
                order = new Order6();
                break;
            case 7:
                order = new Order7();
                break;
            case 8:
                order = new Order8();
                break;
            case 9:
                order = new Order9();
                break;
            case 10:
                order = new Order10();
                break;
            default:
                throw new MyException("対応していない組数(%d)",memberNo);
        }
        return order;
    }
}
