package me.creatorguy.androidoverflowmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout clMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clMain = findViewById(R.id.clMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuMainSettings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuMainGreen:
                if(!item.isChecked()) {
                    item.setChecked(true);
                }
                clMain.setBackgroundColor(Color.GREEN);
                break;

            case R.id.menuMainRed:
                if(!item.isChecked()) {
                    item.setChecked(true);
                }
                clMain.setBackgroundColor(Color.RED);
                break;

            case R.id.menuMainYellow:
                if(!item.isChecked()) {
                    item.setChecked(true);
                }
                clMain.setBackgroundColor(Color.YELLOW);
                break;

            default:
                break;
        }
        return true;
    }
}