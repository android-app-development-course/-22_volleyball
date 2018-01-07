package com.example.jim;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mTextMessage = (TextView) findViewById(R.id.message);
            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

            mOnNavigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            mTextMessage.setText(R.string.title_home);
                            startActivity(new Intent(MainActivity.this,Main2Activity.class));
                            return true;
                        case R.id.navigation_dashboard:
                            mTextMessage.setText(R.string.title_dashboard);
                            Intent intent = new Intent(MainActivity.this,Main3DragActivity.class);
                            startActivity(intent);
                            return true;
                        case R.id.navigation_notifications:
                            mTextMessage.setText(R.string.title_notifications);
                            startActivity(new Intent(MainActivity.this,Main4Activity.class));
                            return true;
                    }
                    return false;
                }
            };


            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        }

        /*@Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    startActivity(new Intent(MainActivity.this,Main3Activity.class));
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    startActivity(new Intent(MainActivity.this,Main4Activity.class));
                    return true;
            }
            return false;
        }*/
    }

