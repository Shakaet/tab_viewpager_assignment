package com.example.tab_viewpager_practice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    View view1;
    List<recycler_model_class> list;

    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view1= inflater.inflate(R.layout.fragment_2, container, false);

        recyclerView=view1.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        list=new ArrayList<>();

        list.add(
                new recycler_model_class(
                        "Apple",
                        "This is more tasty",
                        5,
                        5000,
                        R.drawable.img_6

                )
        );

        list.add(
                new recycler_model_class(
                        "Orange",
                        "This is more sour",
                        4,
                        7000,
                        R.drawable.img_7

                )
        );

        list.add(
                new recycler_model_class(
                        "Watermalon",
                        "This is so sweet",
                        5,
                        10000,
                        R.drawable.img_8

                )
        );

        list.add(
                new recycler_model_class(
                        "Mango",
                        "This is most sweet",
                        5,
                        20000,
                        R.drawable.img_9

                )
        );


        list.add(
                new recycler_model_class(
                        "Jack-fruits",
                        "This is so honey",
                        5,
                        15000,
                        R.drawable.img_8

                )
        );

        list.add(
                new recycler_model_class(
                        "Licchi",
                        "This is so testy",
                        5,
                        25000,
                        R.drawable.img_9

                )
        );


        list.add(
                new recycler_model_class(
                        "Pine-Apple",
                        "This is sweet and sour",
                        3.5,
                        20000,
                        R.drawable.img_7

                )
        );



        recyclerview_adapter adapterClass=new recyclerview_adapter(getActivity(),list);

        recyclerView.setAdapter(adapterClass);


        return view1;


    }
}