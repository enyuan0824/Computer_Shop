package com.example.computer_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class myaddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaddress);

        Spinner s1;
        s1=(Spinner)findViewById(R.id.spinner);
        String[] address ={"Home","Office"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,address);
        s1.setAdapter(adapter);
    }
    public void save(View view) {
        Spinner s1;
        s1= (Spinner) findViewById(R.id.spinner);
        s1.getSelectedItem().toString();
        EditText username = findViewById(R.id.username);
        EditText contact = findViewById(R.id.contact);
        EditText city = findViewById(R.id.city);
        EditText street = findViewById(R.id.street);
        EditText unit = findViewById(R.id.unit);
        Intent intent = new Intent(this, showdetailsmyaddress.class);
        intent.putExtra("username", username.getText().toString());
        intent.putExtra("contact", contact.getText().toString());
        intent.putExtra("city", city.getText().toString());
        intent.putExtra("street", street.getText().toString());
        intent.putExtra("unit", unit.getText().toString());
        intent.putExtra("address",s1.getSelectedItem().toString());
        startActivity(intent);
    }
}