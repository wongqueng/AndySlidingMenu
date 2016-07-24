package com.andywong.andyslidingmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.andywong.views.viewgroup1;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    viewgroup1 menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_menu);
        menu = (viewgroup1) findViewById(R.id.menulayout);
        TextView tx1 = (TextView) findViewById(R.id.tx1);
        TextView tx2 = (TextView) findViewById(R.id.tx2);
        tx1.setOnClickListener(this);
        tx2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tx1:
                menu.setType(1);
                break;
            case R.id.tx2:
                menu.setType(0);
                break;

        }
    }
}
