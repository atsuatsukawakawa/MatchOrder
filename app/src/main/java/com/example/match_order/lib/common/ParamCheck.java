package com.example.match_order.lib.common;

import android.widget.TextView;

import com.example.match_order.lib.error.MyException;

public class ParamCheck {

    static public int getDecimalInteger(TextView view) throws MyException {
        // 文字列に変換
        String int_str = view.getText().toString();
        try {
            // 数値に変換
            return Integer.parseInt(int_str, 10);
        }catch(Exception e){
            throw new MyException(e,"文字列->数値の変換に失敗(value:%s)",int_str);
        }
    }

    static public int getDecimalInteger(TextView view,int max,int min ) throws MyException {
        int num = getDecimalInteger(view);
        if (num > max) {
            throw new MyException("指定した値が上限超過(指定値:%d > 上限：%d)",num, max);
        }
        if (num < min) {
            throw new MyException("指定した値が下限未満(指定値:%d < 下限：%d)",num, min);
        }
        return num;
    }
}
