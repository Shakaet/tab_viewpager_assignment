package com.example.tab_viewpager_practice;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private int[] tab_icon={
            R.drawable.tab1,
            R.drawable.tab2,
            R.drawable.tab3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout=findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ListView"));
        tabLayout.addTab(tabLayout.newTab().setText("Recyclerview"));
        tabLayout.addTab(tabLayout.newTab().setText("Staggered"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPager viewPager=findViewById(R.id.viewpager);

        page_Adapter pageAdapter=new page_Adapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pageAdapter);


        //-extra
        tabLayout.getTabAt(0).setIcon(tab_icon[0]);
        tabLayout.getTabAt(1).setIcon(tab_icon[1]);
        tabLayout.getTabAt(2).setIcon(tab_icon[2]);


     viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

     tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
         @Override
         public void onTabSelected(TabLayout.Tab tab) {
             viewPager.setCurrentItem(tab.getPosition());
         }

         @Override
         public void onTabUnselected(TabLayout.Tab tab) {

         }

         @Override
         public void onTabReselected(TabLayout.Tab tab) {

         }
     });





    }
}