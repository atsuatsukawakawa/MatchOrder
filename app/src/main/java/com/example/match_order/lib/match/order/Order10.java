package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

public class Order10 extends AbstractOrder {
    public Order10() throws MyException {
        m_aIdList = new int[]{1,3,5,7,9,1,2,5,6,8,1,2,5,6,8,1,2,3,6,7,1,2,3,4,7,1,2,3,4,8,1,2,3,4,6,1,2,4,9,5,10,6,7,1,2,3,4,5,1,2,3,4,5,};
        m_bIdList = new int[]{2,4,6,8,10,3,4,7,10,9,4,5,8,9,10,4,5,8,9,10,5,6,10,8,9,6,7,9,5,10,7,9,5,10,8,8,3,9,10,7,9,10,6,7,8,10,8,7,6,9};
        check();
    }
    public int getMemberNum(){
        return 10;
    };

}
