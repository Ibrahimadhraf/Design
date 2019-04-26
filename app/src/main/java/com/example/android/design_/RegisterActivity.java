package com.example.android.design_;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar=findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
         getSupportActionBar().setDisplayHomeAsUpEnabled( true);
         getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
         getSupportActionBar().setTitle("");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
              onBackPressed();
              return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
