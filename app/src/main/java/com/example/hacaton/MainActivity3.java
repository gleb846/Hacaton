package com.example.hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity { // тут находится пароль и эмаил нового пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button butt = (Button) findViewById(R.id.button3); // продолжить после регестрации
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity4.class); // переход на ввод имени
                startActivity(in);
                finish();
            }
        });
    }
}