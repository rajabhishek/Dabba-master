package com.example.bottleneck.dabba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.attr.key;
import static android.R.attr.rating;


public class Overview extends Fragment {
    String namearr[]={"AA","gg"};
    String phonenumberarr[]={"456435634560","34523542325300"};
    String descriptionarr[]={"good","bad"};
    String ratingarr[]={"4.2","2.4"};
    int id;
    TextView name,phonenumber,description,rating;
    public Overview() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Details activity = (Details) getActivity();
        Intent b= activity.getIntent();
       id= b.getIntExtra("id",0);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_overview, container, false);
        name=(TextView)v.findViewById(R.id.nameEditText);
        name.setText(namearr[id]);
        phonenumber=(TextView)v.findViewById(R.id.phoneEditText);
        phonenumber.setText(phonenumberarr[id]);
        description=(TextView)v.findViewById(R.id.describeEditText);
        description.setText(descriptionarr[id]);
        rating=(TextView)v.findViewById(R.id.ratingEditText);
        rating.setText(rating.getText()+"\n"+ratingarr[id]);
        return v;

    }

}