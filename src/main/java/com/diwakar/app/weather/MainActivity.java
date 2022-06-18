package com.diwakar.app.weather;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tablyt;
    TabItem tb1,tb2;
    ViewPager vwpgr;
    EditText edttxt;
    Pageadapter pageadapter;

    ImageButton submitbtn;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));

        tablyt = findViewById(R.id.tablyt);
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        vwpgr = findViewById(R.id.vwpgr);
        edttxt = findViewById(R.id.edttxt);
        pageadapter = new Pageadapter(getSupportFragmentManager(),tablyt.getTabCount());
        vwpgr.setAdapter(pageadapter);
        submitbtn = findViewById(R.id.submitbtn);

        tablyt.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vwpgr.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1)
                    pageadapter.notifyDataSetChanged();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vwpgr.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablyt));

    }

    public void submit(View view) {
        openToday();
        /*String text = edttxt.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("key",text);

        Fragment fragment1 = new Today();
        fragment1.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,fragment1).commit();*/

        //openDays_10();
    }


    public void openToday(){
        String text = edttxt.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("key",text);

        Fragment fragment1 = new Today();
        fragment1.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,fragment1).commit();

        openTomorrow(text);

    }

    private void openTomorrow(String text) {
        Bundle bundle = new Bundle();
        bundle.putString("key",text);

        Fragment fragment2 = new Tomorrow();
        fragment2.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame2,fragment2).commit();

    }

    /*private void openDays_10() {
        String text = edttxt.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("key",text);

        Fragment fragment3 = new Days_10();
        fragment3.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame3,fragment3).commit();

        openTomorrow(text);

    }*/

}