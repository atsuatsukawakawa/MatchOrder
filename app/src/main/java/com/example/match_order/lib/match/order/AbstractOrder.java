package com.example.match_order.lib.match.order;

import com.example.match_order.lib.error.MyException;

abstract public class AbstractOrder {
    int[] m_aIdList;
    int[] m_bIdList;

    public AbstractOrder() throws MyException {}

    public int[] getOrderAList(){
        return m_aIdList;
    }
    public int[] getOrderBList(){
        return m_bIdList;
    }

    abstract public int getMemberNum();

    public int getOrderNum(){
        int mem = getMemberNum();
        return mem*(mem-1)/2;
    }

    public void check() throws MyException {
        try {
            if (getOrderNum() != m_aIdList.length) {
                throw new MyException("%dのAList数(%d)が%dと不一致",getMemberNum(),m_aIdList.length, getOrderNum());
            }
            if (getOrderNum() != m_bIdList.length) {
                throw new MyException("%dのList数(%d)が%dと不一致",getMemberNum(),m_bIdList.length, getOrderNum());
            }
            for (int i = 0; i < getOrderNum(); i++) {
                if (m_aIdList[i] == m_bIdList[i]) {
                    throw new MyException("%dに同じカードでの対戦が存在(index:%d)",getMemberNum(),i);
                }
            }
        }catch (Exception e){
            throw new MyException(e.toString());
        }

    }

}
