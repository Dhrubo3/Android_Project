package com.dhrubo.custommenubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item1){

        }else if(item.getItemId() == R.id.item2){

        }else if (item.getItemId() == R.id.item3){

            Toast.makeText(MainActivity.this, "User has clicked on item3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}