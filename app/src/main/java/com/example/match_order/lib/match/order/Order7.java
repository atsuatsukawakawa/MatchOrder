package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order7 extends AbstractOrder {
    public Order7() throws MyException {
        m_aIdList = new int[]{1,3,5,1,2,4,6,1,2,4,3,1,2,3,5,1,2,3,4,1,2};
        m_bIdList = new int[]{2,4,6,7,3,5,7,3,5,6,7,5,4,6,7,4,6,5,7,6,7};
        check();
    }
    public int getMemberNum(){
        return 7;
    };

}
