package com.example.computer_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class staffupdateproduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffupdateproduct);

        Button exitUpdate = findViewById(R.id.button_ExitUpdateProduct);
        exitUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(staffupdateproduct.this, inventorymanagement.class);
                startActivity(intent);
            }
        });
    }
}