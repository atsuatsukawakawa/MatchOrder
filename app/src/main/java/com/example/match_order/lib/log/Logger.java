package com.example.match_order.lib.log;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static final String APPNAME = "MATCHORDER";

    public static final int INF_MSG = 0;
    public static final int ERR_MSG = 1;
    public static final int WRN_MSG = 2;
    public static final int DBG_MSG = 3;

    private Logger(){};

    public static void Logging(int level, String msg){
        String tag = "ERR";
        switch (level) {
            case INF_MSG:
                tag = "INF";
                break;
            case ERR_MSG:
                tag = "ERR";
                break;
            case WRN_MSG:
                tag = "WRN";
                break;
            case DBG_MSG:
                tag = "DBG";
                break;
            default:
                tag = "UNKOWN";
        }
        SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
        Log.d(tag,String.format("|%s|%s|%s",APPNAME,format.format(new Date()),msg));
    }
    public static void Logging(int level, String format, Object... args){
        Logging(level,String.format(format,args));
    }

}
