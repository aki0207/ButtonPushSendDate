package com.example.buttonpushsenddate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // idがtransitionのボタンを取得
        Button button = (Button) findViewById(R.id.transition);
        // clickイベント追加
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // インテント作成  第二引数にはパッケージ名からの指定で、遷移先クラスを指定
                Intent intent = new Intent(MainActivity.this, com.example.buttonpushsenddate.SecondActivity.class);
                // 値を引き渡す (識別名, 値)の順番で指定します
                intent.putExtra("text1", "渡された値でーす");
                // Activity起動
                startActivity(intent);


            }
        });
    }
}