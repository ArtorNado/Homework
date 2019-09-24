package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FiftfActivity extends AppCompatActivity {

    private Button teleport_A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiftf);
        addListennerOnButton();
    }

    public void addListennerOnButton(){
        teleport_A = (Button)findViewById(R.id.teleport_A);
        teleport_A.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
