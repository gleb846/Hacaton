package com.example.hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity { // тут эмаил и пароль зарегисрированного пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buut = (Button) findViewById(R.id.button4); // вход в сущ. акк. переход на главный экран
        buut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity5.class); // переход на главный экран
                startActivity(in);
                finish();
            }
        });
    }
}