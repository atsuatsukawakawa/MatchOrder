package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order3 extends AbstractOrder {
    public Order3() throws MyException {
        m_aIdList = new int[]{1, 2, 1};
        m_bIdList = new int[]{2, 3, 3};
        check();
    }
    public int getMemberNum(){
        return 3;

    };

}
