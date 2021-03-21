package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order5 extends AbstractOrder {
    public Order5() throws MyException {
        m_aIdList = new int[]{1, 3, 1, 2 ,4 ,1,2,3,1,2};
        m_bIdList = new int[]{2, 4, 5, 3, 5, 3,4,5,4,5};
        check();
    }
    public int getMemberNum(){
        return 5;

    };

}
