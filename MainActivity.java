package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText UsernameField;
    EditText PassField;
    RadioGroup RadioGroup;
    RadioButton MaleButton, FemaleButton;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameField = findViewById(R.id.UsernameField);
        PassField = findViewById(R.id.PassField);
        RadioGroup = findViewById(R.id.RadioGroup);
        MaleButton = findViewById(R.id.MaleButton);
        FemaleButton = findViewById(R.id.FemaleButton);
        LoginButton = findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ValidasiData();
    }

    public void ValidasiData () {
        Editable Username = UsernameField.getText();
        Editable Password = PassField.getText();
        String Gender = "";

        if (TextUtils.isEmpty(Username) && TextUtils.isEmpty(Password)){
            UsernameField.setError("Tidak Boleh Kosong");
        }else if (Password.length() < 8 || Password.length() > 25 ) {
            Toast.makeText(this, "Password > 8 || Password = 25", Toast.LENGTH_SHORT).show();
        }else {
            AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
            AlertDialog.setTitle("Succes");
            AlertDialog.show();
        }

        if(MaleButton.isChecked()){
            Gender = "Male";
        }else{
            Gender = "Female";
        }

    }

}