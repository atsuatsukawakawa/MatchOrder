package com.example.match_order;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.match_order.lib.log.Logger;
import com.example.match_order.lib.error.MyException;
import com.example.match_order.lib.common.ParamCheck;

public class InitialActivity extends AbstractActivity {

    static final int MAXMEMBER = 10;
    static final int MINMEMBER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // メイン画面を作成
        Logger.Logging(Logger.DBG_MSG, "#################### application start... ####################");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.load_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.Logging(Logger.DBG_MSG, "OnClickListener called");
                int backs = 0;
                int forwards = 0;
                try {
                    try {
                        // 後衛数を取得(数値チェック)
                        backs = ParamCheck.getDecimalInteger(findViewById(R.id.back),MAXMEMBER,MINMEMBER);
                    } catch (MyException e) {
                        e.addMessage("後衛の人数指定が不正(%s)",((TextView)findViewById(R.id.back)).getText().toString());
                        throw e;
                    }

                    try {
                        // 前衛数を取得(数値チェック)
                        forwards = ParamCheck.getDecimalInteger(findViewById(R.id.forward),MAXMEMBER,MINMEMBER);
                    } catch (MyException e) {
                        e.addMessage("前衛の人数指定が不正(%s)",((TextView)findViewById(R.id.forward)).getText().toString());
                        throw e;
                    }

                    String[] back_names = new  String[MAXMEMBER];
                    back_names[0] = ((TextView)findViewById(R.id.back1)).getText().toString();
                    back_names[1] = ((TextView)findViewById(R.id.back2)).getText().toString();
                    back_names[2] = ((TextView)findViewById(R.id.back3)).getText().toString();
                    back_names[3] = ((TextView)findViewById(R.id.back4)).getText().toString();
                    back_names[4] = ((TextView)findViewById(R.id.back5)).getText().toString();
                    back_names[5] = ((TextView)findViewById(R.id.back6)).getText().toString();
                    back_names[6] = ((TextView)findViewById(R.id.back7)).getText().toString();
                    back_names[7] = ((TextView)findViewById(R.id.back8)).getText().toString();
                    back_names[8] = ((TextView)findViewById(R.id.back9)).getText().toString();
                    back_names[9] = ((TextView)findViewById(R.id.back10)).getText().toString();
                    String[] forward_names = new  String[MAXMEMBER];
                    forward_names[0] = ((TextView)findViewById(R.id.forward1)).getText().toString();
                    forward_names[1] = ((TextView)findViewById(R.id.forward2)).getText().toString();
                    forward_names[2] = ((TextView)findViewById(R.id.forward3)).getText().toString();
                    forward_names[3] = ((TextView)findViewById(R.id.forward4)).getText().toString();
                    forward_names[4] = ((TextView)findViewById(R.id.forward5)).getText().toString();
                    forward_names[5] = ((TextView)findViewById(R.id.forward6)).getText().toString();
                    forward_names[6] = ((TextView)findViewById(R.id.forward7)).getText().toString();
                    forward_names[7] = ((TextView)findViewById(R.id.forward8)).getText().toString();
                    forward_names[8] = ((TextView)findViewById(R.id.forward9)).getText().toString();
                    forward_names[9] = ((TextView)findViewById(R.id.forward10)).getText().toString();

                    //インテントの作成
                    Intent intent = new Intent(getApplication(), MatchOrderActivity.class);
                    // 引き継ぐパラメータをセット
                    intent.putExtra("backs", backs);
                    intent.putExtra("back_names", back_names);
                    intent.putExtra("forwards", forwards);
                    intent.putExtra("forward_names", forward_names);
                    startActivity(intent);
                } catch (MyException e) {
                    e.addMessage("入力値が異常");
                    errorAction(e);
                }catch (Exception e){
                    MyException me =  new MyException(e,"入力値が異常");
                    errorAction(e);
                }
            }
        });
        Logger.Logging(Logger.DBG_MSG, "#################### application started ####################");
    }
}