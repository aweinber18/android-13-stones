package com.example.thirteenstones.activities;

import android.content.Intent;
import android.os.Bundle;
import com.example.thirteenstones.lib.DialogUtils;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.example.thirteenstones.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_new_game) {
            startNextNewGame();
            return true;
        } else if (id == R.id.action_statistics) {
            showStatistics();
            return true;
        } else if (id == R.id.action_reset_stats) {
            //resetStats();
            return true;
        } else if (id == R.id.action_settings) {
            showSettings();
            return true;
        } else if (id == R.id.action_about) {
            showAbout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void startNextNewGame() {

    }

    private void showStatistics() {
        Intent intent = new Intent(getApplicationContext(), StatisticsActivity.class);
        startActivity(intent);
    }

    private void showAbout() {
        DialogUtils.showInfoDialog(this,
                "About 13 Stones", "Our second in-class of the semester!");
    }

    private void showSettings() {
        
    }

}