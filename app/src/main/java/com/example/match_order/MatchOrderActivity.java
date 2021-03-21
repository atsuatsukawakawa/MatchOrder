package com.example.match_order;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.match_order.lib.error.MyException;
import com.example.match_order.lib.match.MakeMatchOrder;
import com.example.match_order.lib.log.Logger;
import com.example.match_order.lib.match.Match;

import java.util.List;

public class MatchOrderActivity extends AbstractActivity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = this.getIntent();
        int backs = intent.getIntExtra("backs",0);
        int forwards = intent.getIntExtra("forwards",0);
        String[] back_names = intent.getStringArrayExtra("back_names");
        String[] forward_names = intent.getStringArrayExtra("forward_names");
        try {
            ListView listView  = new ListView(this);
            setContentView(listView);
            // 組み合わせの結果の作成
            MakeMatchOrder matchOrderMaker = new MakeMatchOrder(backs, forwards,back_names,forward_names);
            /*
            List<Match> matchList = matchOrderMaker.getMatchOrderList();
            Match[] matches = new Match[matchList.size()];
            matchList.toArray(matches);



            ArrayAdapter<Match> arrayAdapter
                    = new ArrayAdapter<Match>(this, android.R.layout.simple_list_item_1, matches);
            listView.setAdapter(arrayAdapter);
*/
            List<String> matches = matchOrderMaker.getMatchOrderListString();
            ArrayAdapter<String> arrayAdapter
                    = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, matches);
            listView.setAdapter(arrayAdapter);
            Logger.Logging(Logger.INF_MSG, "OnClickListener success");
        } catch (MyException e) {
            Logger.Logging(Logger.ERR_MSG, "OnClickListener error(%s)", e);
            errorAction(e);
        }
    }
}
