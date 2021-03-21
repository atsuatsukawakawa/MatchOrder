package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order8 extends AbstractOrder {
    public Order8() throws MyException {
        m_aIdList = new int[]{1,3,5,7,1,2,5,6,1,2,3,6,1,2,3,4,1,5,2,4,1,2,3,4,1,2,4,3};
        m_bIdList = new int[]{2,4,6,8,3,4,7,8,4,5,8,7,5,6,7,8,6,8,7,5,7,8,5,6,8,3,7,6};
        check();
    }
    public int getMemberNum(){
        return 8;
    };

}
