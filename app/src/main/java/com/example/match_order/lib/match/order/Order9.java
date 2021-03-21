package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order9 extends AbstractOrder {
    public Order9() throws MyException {
        m_aIdList = new int[]{1,3,5,7,1,2,4,6,8,1,2,5,6,2,1,2,3,5,4,1,2,3,4,5,1,2,3,4,6,1,2,3,4,7,1,3};
        m_bIdList = new int[]{2,4,6,8,9,3,5,7,9,3,4,7,8,9,4,6,7,8,9,5,7,8,6,9,6,8,5,7,9,7,5,6,8,9,8,9};
        check();
    }
    public int getMemberNum(){
        return 9;
    };

}
