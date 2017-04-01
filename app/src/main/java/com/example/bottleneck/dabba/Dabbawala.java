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
        namelist.add("DB1"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB12"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB2"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB3"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");
        namelist.add("DB4"+"\n"+"Pickup Time:7:00am \t Drop Time: 12:00pm");


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
