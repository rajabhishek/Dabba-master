package com.example.bottleneck.dabba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Dabbawala extends AppCompatActivity {

    ListView listView;
    private List<String>namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dabbawala);
        listView=(ListView)findViewById(R.id.listView);
        namelist=new ArrayList<String>();
        CreateListView();
    }
    private void CreateListView()
    {
        namelist.add("Mukesh"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("Ramesh"+"\n"+"Pickup Time:8:00am \t Drop Time: 1:00pm");
        namelist.add("Nitin"+"\n"+"Pickup Time:9:00am \t Drop Time: 2:00pm");
        namelist.add("Rajesh"+"\n"+"Pickup Time:10:00am \t Drop Time: 2:00pm");
        namelist.add("Tiwari"+"\n"+"Pickup Time:7:00am \t Drop Time: 1:00pm");
        namelist.add("Sumit"+"\n"+"Pickup Time:8:00am \t Drop Time: 2:00pm");
        namelist.add("Anand"+"\n"+"Pickup Time:9:00am \t Drop Time: 11:00pm");
        namelist.add("Shasank"+"\n"+"Pickup Time:10:00am \t Drop Time: 12:00pm");
        namelist.add("Mukesh"+"\n"+"Pickup Time:11:00am \t Drop Time: 2:00pm");
        namelist.add("Nitin"+"\n"+"Pickup Time:8:00am \t Drop Time: 12:00pm");
        namelist.add("Tiwari"+"\n"+"Pickup Time:9:00am \t Drop Time: 12:00pm");
        namelist.add("Mukesh"+"\n"+"Pickup Time:8:00am \t Drop Time: 12:00pm");
        namelist.add("Nitin"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("Tiwari"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("Mukesh"+"\n"+"Pickup Time:6:00am \t Drop Time: 12:00pm");


        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,namelist));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
                Intent intent = new Intent(getApplicationContext() , Details.class);
                intent.putExtra("id" , arg2);
                startActivity(intent);
            }
        });
    }
}
