package com.example.pawsome;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.pawsome.Tab.fragmentadapter;
import com.google.android.material.tabs.TabLayout;

import java.sql.Array;

public class mainpage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 pager2;
    fragmentadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mainpage);

    tabLayout=findViewById(R.id.tabs);
    pager2=findViewById(R.id.viewpage);


        FragmentManager fm =getSupportFragmentManager();
        adapter= new fragmentadapter(fm,getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("HOME"));
        tabLayout.addTab(tabLayout.newTab().setText("SEARCH"));
        tabLayout.addTab(tabLayout.newTab().setText("BREEDS"));
        tabLayout.addTab(tabLayout.newTab().setText("FAVOURITES"));
        tabLayout.addTab(tabLayout.newTab().setText("UPLOAD"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
              tabLayout.selectTab (tabLayout.getTabAt(position));
            }
        });

    }

}