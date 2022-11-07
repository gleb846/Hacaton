package com.example.hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {  // самое начало (вход в приложение)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button); // кнопка войти
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MainActivity2.class ); // войти
                startActivity(in);
                finish();
            }
        });
        Button but = (Button) findViewById(R.id.button2); //  кнопка Регистрация
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MainActivity3.class); // ввести эмаил и придумать пароль
                startActivity(in);
                finish();
            }
        });


    }
}