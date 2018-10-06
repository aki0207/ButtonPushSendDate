package com.example.buttonpushsenddate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //メインアクティビティからインテントを取得
        Intent intent = this.getIntent();
        //値を取得
        String text = intent.getStringExtra("text1");
        //画面に表示
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);

        Button finishButton = (Button) findViewById(R.id.finish_button);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }


}
