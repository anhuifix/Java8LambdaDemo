package com.example.anhuifix.rjavademo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //点击事件表达式
        findViewById(R.id.tv_buton).setOnClickListener(v -> {
            Toast.makeText(this,"\"普通的点击事件\"",0).show();
        });

        //线程事件表达式
        findViewById(R.id.tv_throw).setOnClickListener(v -> {

            new Thread(() -> {
                ((TextView)findViewById(R.id.tv_throw)).setText("修改成功");
            }).start();
        });
    }
}
