package com.example.tmlab;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;


public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText FullnameField, UsernameField, PassField, ConfirmPassField, PhoneField;
    Button RegisButton;
    RadioGroup RadioGroup;
    RadioButton MaleButton, FemaleButton;

    private Pattern password = Pattern.compile(
      "^" + "(?=.[0-9])" + "(?=.[a-z])" + "(?=.[A-Z])"
              + "(?=.*[@#$%^&+=])" + ".{8,20}" + "$"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        RegisButton = findViewById(R.id.RegisButton);
        FullnameField = findViewById(R.id.FullnameField);
        UsernameField = findViewById(R.id.UsernameField);
        PassField = findViewById(R.id.PassField);
        ConfirmPassField = findViewById(R.id.ConfirmPassField);
        PhoneField = findViewById(R.id.PhoneField);
        RadioGroup = findViewById(R.id.RadioGroup);
        MaleButton = findViewById(R.id.MaleButton);
        FemaleButton = findViewById(R.id.FemaleButton);
        RegisButton.setOnClickListener(this);
    }

    public void ValidasiFullname() {

        if (FullnameField == null) {
            FullnameField.setError("Field can't be empty");
        }
    }

    public void ValidasiPass() {
        if(PassField == null){
            PassField.setError("Field can't be empty");
        } else if (!password.matcher(PassField.getText()).matches()) {
            PassField.setError("password need {A-a-!@#$}");
        }
    }

    public void ValidasiConfirm () {
        if (TextUtils.isEmpty((CharSequence) ConfirmPassField)) {
            ConfirmPassField.setError("Field can't be empty");
        } else if (ConfirmPassField.getText() != PassField.getText()) {
            ConfirmPassField.setError("Password does'nt match");
        }
    }

    public void ValidasiPhone () {
        if(TextUtils.isEmpty((CharSequence) PhoneField)){
            PhoneField.setError("Field can't be empty");
        }
    }

    public void ValidasiRadioButton () {
        String Gender = "" ;

        if(MaleButton.isChecked()){
            Gender = "Male";
        }else{
            Gender = "Female";
        }
    }

    @Override
    public void onClick(View v) {
        ValidasiFullname();
        ValidasiPass();
        ValidasiConfirm();
        ValidasiPhone();
        ValidasiRadioButton();
    }
}
