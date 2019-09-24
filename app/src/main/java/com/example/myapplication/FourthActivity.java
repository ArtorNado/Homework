package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    private Button teleport_E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        addListennerOnButton();
    }


    public void addListennerOnButton(){
        teleport_E = (Button)findViewById(R.id.teleport_E);
        teleport_E.setOnClickListener(v -> {
            Intent intent = new Intent(this, FiftfActivity.class);
            startActivity(intent);
        });
    }
}
