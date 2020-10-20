package com.example.tmlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TopUp extends AppCompatActivity implements View.OnClickListener {

    Button UpdateBalance ;
    TextView Balance ;
    int balance ;

    public TextView getBalance() {
        return Balance;
    }

    public void setBalance(TextView balance) {
        Balance = balance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topup);

        Balance.findViewById(R.id.Balance);
        UpdateBalance.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (TopUp.this, UpdateBalnce.class );
        startActivity(intent);
    }
}
