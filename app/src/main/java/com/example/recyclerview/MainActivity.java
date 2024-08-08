package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.CountryAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycalViewList;

    String[] country ={"India", "China", "USA", "Indonesia", "Pakistan", "Brazil", "Nigeria", "Bangladesh", "Russia", "Mexico", "Japan", "Philippines", "Vietnam", "Ethiopia", "Egypt", "Germany", "Iran", "Turkey", "Thailand", "Tanzania", "South Africa", "Sudan"};
    String[] capital ={"New Delhi", "Beijing", "Washington", "Jakarta", "Islamabad", "Brasilia", "Abuja", "Dhaka", "Moscow", "Mexico City", "Tokyo", "Manila", "Hanoi", "Addis Ababa", "Cairo", "Berlin", "Tehran", "Ankara", "Bangkok", "Dar es Salaam", "Pretoria", "Khartoum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();
        initRv();
    }

    void initBinding(){
        recycalViewList = findViewById(R.id.recycleViewList);
    }

    void initRv(){
        CountryAdapter adapter = new CountryAdapter(country, capital);
        recycalViewList.setAdapter(adapter);

    }
}