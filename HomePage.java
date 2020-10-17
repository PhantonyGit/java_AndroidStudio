package com.example.tmlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        RecyclerView ListRecycler = findViewById(R.id.recycler);
        Vector<DataList> dota = new Vector<>();
        dota.add(new DataList("nama" , 10));
        dota.add(new DataList("yolk" , 10));
        dota.add(new DataList("gumz" , 10));
        dota.add(new DataList("tera" , 10));
        dota.add(new DataList("eat" , 10));

        ListAdapter listadapter = new ListAdapter(this);
        listadapter.setListVector(dota);

        ListRecycler.setAdapter(listadapter);
        ListRecycler.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.TopUp) {
            startActivity(new Intent(this, TopUp.class));
        }else {
            HomePage.this.finish();
            Intent intent = new Intent (HomePage.this, MainActivity.class );
            startActivity(intent);
        }

        return  true ;
    }

}
