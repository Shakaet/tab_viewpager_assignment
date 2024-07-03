package com.example.tab_viewpager_practice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Fragment1 extends Fragment {

    View view;

    String[] str={"The first known examples of a team game involving a ball, which was made out of a rock","The ball would symbolize the sun and the captain of the losing team would be sacrificed to the gods","The first known ball game which also involved kicking took place","Perhaps even older than cuju was Marn Gook","Other variety of ball games had been known from Ancient Greece","The most admitted story tells that the game was developed in England"};
    String [] date={"20-03-2024","21-03-2024","22-03-2024","23-03-2024","24-03-2024","25-03-2024"};

    String[] time={"10:30pm","11:30pm","12:30pm","1:30pm","2:30pm","3:30pm"};

    Integer [] imag={
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img,
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_1, container, false);


      ListView listView=view.findViewById(R.id.listview);

      listview_adapter listviewAdapter=new listview_adapter(getActivity(),str,date,time,imag);

      listView.setAdapter(listviewAdapter);

      return view;


    }
}