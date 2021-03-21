package com.example.match_order.lib.error;

import com.example.match_order.lib.log.Logger;

import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception{
    List<String> m_errList = new ArrayList<String>();

    public MyException(String errMsg){
        super(errMsg);
        addMessage(errMsg);
    }
    public MyException(String format,Object... args){
        this(String.format(format,args));
    }
    public MyException(Object obj){
        this(obj.toString());
    }
    public MyException(String errMsg ,MyException mye){
        this(String.format("%s -> %s",errMsg, mye.getMessage()));
    }
    public MyException(Exception exc,String format,Object... args){
        this(String.format("%s",exc.toString()));
        addMessage(String.format(format,args));
    }

    public void addMessage(String format,Object... args){
        addMessage(String.format(format,args));
    }
    public void addMessage(String error_message){ m_errList.add(error_message); }

    public String dumpErrMessage(){
        StringBuilder sb = new StringBuilder();
        for(String err: m_errList){
            Logger.Logging(Logger.ERR_MSG,err);
            sb.append("-> " + err );
        }
        return sb.toString();
    }
    @Override
    public String getMessage(){
        return dumpErrMessage();
    }
}
