package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order6 extends AbstractOrder {
    public Order6() throws MyException {
        m_aIdList = new int[]{1,3,5,1,4,2,1,2,3,1,2,4,3,2,1};
        m_bIdList = new int[]{2,4,6,3,5,6,4,5,6,5,3,6,5,4,6};
        check();
    }
    public int getMemberNum(){
        return 6;
    };

}
