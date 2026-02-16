package com.example.mealmate.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mealmate.R;
import com.example.mealmate.adapters.DetailedDailyAdapter;
import com.example.mealmate.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String type = getIntent().getStringExtra("type");

        setContentView(R.layout.activity_detailed_daily_meal);
            imageView = findViewById(R.id.detailed_img);

            recyclerView = findViewById(R.id.detailed_rec);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            detailedDailyModelList = new ArrayList<>();
            dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
            recyclerView.setAdapter(dailyAdapter);

            if(type !=null && type.equalsIgnoreCase("breakfast")){
                detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b1,"vada sambar","Description","4.4","40","10 to 9"));
                detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b2,"Steamed Idli","Description","4.4","40","10 to 9"));
                detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b3,"Dahi Wada","Description","4.4","40","10 to 9"));
                detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b4,"Paratha","Description","4.4","40","10 to 9"));
                detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b5,"Egg Bhurji","Description","4.4","40","10 to 9"));
                dailyAdapter.notifyDataSetChanged();
            }
        if(type !=null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Jems","Description","4.4","99","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweet Cake","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Ice-Cream","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Cake","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ss1,"Moong Dal Halwa","Description","4.4","99","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ss2,"Pancake","Description","4.4","99","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l1,"Paneer Butter Masala (4 Roti)","Description","4.4","135","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l2,"Lunch Box Thali","Description","4.4","160","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l3,"Chilly paneer","Description","4.4","215","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l4,"Fulka Roti","Description","4.4","9","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l5,"Dal Tadka (4 Roti)","Description","4.4","125","10 to 9"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d1,"Paneer Dinner Thali (Jumbo)","Description","4.4","230","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d2,"Vegetable fried Rice","Description","4.4","199","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d3,"Chicken Masala (4 Roti)","Description","4.4","135","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d4,"Paneer Saoji (4 Roti)","Description","4.4","125","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d5,"Egg Butter Masala (4 Roti)","Description","4.4","115","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc1,"Irish coffee","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc2,"Nutella coffee","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc3,"Cappuccino coffee","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc4,"Hazelnut coffee","Description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc5,"Filter coffee","Description","4.4","40","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}