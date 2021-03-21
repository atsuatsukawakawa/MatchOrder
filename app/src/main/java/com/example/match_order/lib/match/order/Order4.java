package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order4 extends AbstractOrder {
    public Order4() throws MyException {
        m_aIdList = new int[]{1, 3, 1, 2 ,1 ,2};
        m_bIdList = new int[]{2, 4, 3, 4, 4, 3};
        check();
    }
    public int getMemberNum(){
        return 4;

    };

}
