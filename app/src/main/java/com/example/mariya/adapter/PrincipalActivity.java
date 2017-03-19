package com.example.mariya.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Item> items;
    public ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principa);

        list = (ListView) findViewById(R.id.lista);
        items = new ArrayList<Item>();
        items.add(new Item(1,"Tom ",R.drawable.bird, "red"));
        items.add(new Item(2,"John",R.drawable.caw, "white"));
        items.add(new Item(3,"Black",R.drawable.elefant, "blue"));
        items.add(new Item(4,"Adan",R.drawable.fog, "yellow"));
        items.add(new Item(5,"Alvin",R.drawable.pig, "pink"));

        adapter = new ItemAdapter(getApplicationContext(),items);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {

                Item item = (Item) list.getAdapter().getItem(position);

                String namLabel = item.name;
                Log.d("PrincipalActivity: ", item.name);
            }
        });




    }
}
