package com.example.computer_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class inventorymanagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventorymanagement);

        ImageButton editProduct = findViewById(R.id.imgButtonEdit);
        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventorymanagement.this, staffupdateproduct.class);
                startActivity(intent);
            }
        });

        Button addProduct = findViewById(R.id.button_addProduct);
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventorymanagement.this, staffaddproduct.class);
                startActivity(intent);
            }
        });

        Button viewRecord = findViewById(R.id.button_ViewRecord);
        viewRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventorymanagement.this, staffViewCurrentOrder.class);
                startActivity(intent);
            }
        });

        Button exitInventory = findViewById(R.id.button_ExitInventory);
        exitInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventorymanagement.this, dashboard.class);
                startActivity(intent);
            }
        });
    }

}