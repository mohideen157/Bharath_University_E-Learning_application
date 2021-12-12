package com.blogspot.vv6338.sylabusalphabuild;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_sbm,button_sbm1,button_sbm2,button_sbm3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        button_sbm=(Button)findViewById(R.id.button1);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.blogspot.vv6338.sylabusalphabuild.Main2Activity");
                        startActivity(intent);

                    }
                }
        );

        button_sbm1=(Button)findViewById(R.id.button2);
        button_sbm1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.blogspot.vv6338.sylabusalphabuild.Main3Activity");
                        startActivity(intent);

                    }
                }
        );

        button_sbm2=(Button)findViewById(R.id.button3);
        button_sbm2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.blogspot.vv6338.sylabusalphabuild.Main4Activity");
                        startActivity(intent);

                    }
                }
        );

        button_sbm3=(Button)findViewById(R.id.button4);
        button_sbm3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.blogspot.vv6338.sylabusalphabuild.Main5Activity");
                        startActivity(intent);

                    }
                }
        );
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
