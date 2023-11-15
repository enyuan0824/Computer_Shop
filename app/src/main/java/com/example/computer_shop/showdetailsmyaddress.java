package com.example.computer_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class showdetailsmyaddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetailsmyaddress);

        Intent intent = getIntent();

        TextView a =findViewById(R.id.username);
        TextView b =findViewById(R.id.contact);
        TextView c =findViewById(R.id.city);
        TextView d =findViewById(R.id.street);
        TextView e =findViewById(R.id.unit);
        TextView f = findViewById(R.id.textView49);

        String username =intent.getStringExtra("username");
        String contact = intent.getStringExtra("contact");
        String city =intent.getStringExtra("city");
        String street = intent.getStringExtra("street");
        String unit = intent.getStringExtra("unit");
        String address = intent.getStringExtra("address");


        a.setText(username);
        b.setText(contact);
        c.setText(city);
        d.setText(street);
        e.setText(unit);
        f.setText(address);

        Toast.makeText(this,username, Toast.LENGTH_SHORT).show();

        Toast.makeText(this,contact, Toast.LENGTH_SHORT).show();


    }
    public void cancel(View view) {
        Intent intent = new Intent(this,myaddress.class);
        startActivity(intent);
    }
}
