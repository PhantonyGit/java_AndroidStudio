package com.example.tmlab;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText UsernameField, PassField;
    Button LoginButton, RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameField = findViewById(R.id.UsernameField);
        PassField = findViewById(R.id.PassField);
        LoginButton = findViewById(R.id.LoginButton);
        RegisterButton = findViewById(R.id.RegisterButton);
        LoginButton.setOnClickListener(this);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.register);
            }
        });

    }

    public void ValidasiData () {
        Editable Username = UsernameField.getText();
        Editable Password = PassField.getText();

        if (TextUtils.isEmpty(Username) || TextUtils.isEmpty(Password)){
            UsernameField.setError("Tidak Boleh Kosong");
            PassField.setError("Tidak Boleh Kosong");
        }
        else if (Password.length() < 8 || Password.length() > 25 ) {
            Toast.makeText(this, "Password > 8 || Password = 25", Toast.LENGTH_SHORT).show();
        }else {
            AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
            AlertDialog.setTitle("Succes");
            AlertDialog.show();
        }
    }

    @Override
    public void onClick(View v) {

    }

}