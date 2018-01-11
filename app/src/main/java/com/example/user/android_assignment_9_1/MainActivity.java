package com.example.user.android_assignment_9_1;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar= getSupportActionBar();
        //Android action bar was introduced to maintain a consistent navigation across the application
        //A TextView displays text to the user and optionally allows them to edit it. A TextView is a complete text editor,
        // however the basic class is configured to not allow editing.

        textView = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //// Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_assign,menu);
        ////Menu Resource, Menu
        return super.onCreateOptionsMenu(menu);
        //we are inflating the menu by calling the inflate() method of MenuInflater class. To perform event handling on menu items,
        // you need to override onOptionsItemSelected() method of Activity class.


    }

    @Override
    /*Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc.
    */
    public boolean onOptionsItemSelected(MenuItem item) {
        //respond to menu item selection.The system will automatically call the "onOptionsItemSelected" method when
        // the user chooses any of the options menu items.
        //switch statement executes one statement from multiple conditions
        switch (item.getItemId())
        // getItemId() method queries the ID for the selected menu item, which you should assign to each menu item
        // in XML using the android:id attribute
        {
            //Add a case statement for each item in your menu.
            case R.id.red:
                //this refers to the id which is given in layout xml file
                //setTextColor is for setting text color
                textView.setTextColor(Color.RED);
                break;
            case R.id.green:
                textView.setTextColor(Color.GREEN);
                break;
            case R.id.blue:
                textView.setTextColor(Color.BLUE);
                break;
        }

        return super.onOptionsItemSelected(item);
        //super keyword is used to refer the immediate parent class object.
    }
}

