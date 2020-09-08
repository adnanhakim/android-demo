package com.teamvoid.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<String> todoList = new ArrayList<>();
        todoList.add("A");
        todoList.add("B");
        todoList.add("C");

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todoList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            String item = todoList.get(position);
            Toast.makeText(ListActivity.this, item + " is clicked", Toast.LENGTH_SHORT).show();
        });
    }
}