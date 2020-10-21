package com.example.tmlab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateBalnce extends AppCompatActivity implements View.OnClickListener {

    Button UpdateButton;
    EditText BalanceField , UpdatePassField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_balance);

        BalanceField = findViewById(R.id.BalanceField);
        UpdatePassField = findViewById(R.id.UpdatePassField);
        UpdateButton = findViewById(R.id.UpdateButton);
        UpdateButton.setOnClickListener(this);
    }

    public EditText getBalanceField() {
        return BalanceField;
    }

    public void setBalanceField(EditText balanceField) {
        BalanceField = balanceField;
    }

    @Override
    public void onClick(View v) {
        BalanceField.getText();
        Toast.makeText(this, "Update Succes", Toast.LENGTH_SHORT).show();
    }
}
