package com.example.tab_viewpager_practice;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class page_Adapter extends FragmentStatePagerAdapter {

    int no_of_tab;

    public page_Adapter(@NonNull FragmentManager fm, int no_of_tab) {
        super(fm);
        this.no_of_tab = no_of_tab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment1 fragment1=new Fragment1();
                return fragment1;
            case 1:
                Fragment2 fragment2=new Fragment2();
                return fragment2;
            case 2:
                Fragment3 fragment3=new Fragment3();
                return fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return no_of_tab;
    }
}
