package com.example.computer_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button inventory = findViewById(R.id.buttonInventory);
        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, inventorymanagement.class);
                startActivity(intent);
            }
        });

        Button currentOrder = findViewById(R.id.buttonCurrentOrder);
        currentOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, staffViewCurrentOrder.class);
                startActivity(intent);
            }
        });
    }
}