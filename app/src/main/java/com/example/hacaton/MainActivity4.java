package com.example.hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity { // ввод имени нового пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) { //5
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button bt = (Button) findViewById(R.id.button5); // переход на указание пола
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity7.class); // "ваш пол"
                startActivity(in);
                finish();
            }
        });
    }
}