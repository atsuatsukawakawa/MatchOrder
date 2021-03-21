package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order2 extends AbstractOrder {
    public Order2() throws MyException {
        m_aIdList = new int[]{1};
        m_bIdList = new int[]{2};
        check();
    }
    public int getMemberNum(){
        return 2;

    };

}
