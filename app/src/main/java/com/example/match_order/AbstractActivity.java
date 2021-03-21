package com.example.match_order;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.match_order.lib.log.Logger;


abstract public class AbstractActivity extends AppCompatActivity {
    public static final String  MESSEGE_KEY = "error_message";

    //インテントの作成
    public void errorAction(String error_message) {
        Intent intent = new Intent(getApplication(), ErrorActivity.class);
        intent.putExtra(MESSEGE_KEY,error_message);
        // Logger.Logging(Logger.ERR_MSG,"ERROR画面へ遷移(%s)",e.toString());
        startActivity(intent);
    }
    //インテントの作成
    public void errorAction(Exception e) {
        errorAction(e.toString());
    }
    public void errorAction(String format ,Object... args ) {
        errorAction(String.format(format,args));
    }
    @Override
    public void startActivity(android.content.Intent intent){
        Logger.Logging(Logger.DBG_MSG, "画面遷移(%s->%s)",this.getClass(), intent.getClass());
        super.startActivity(intent);
    }
}
