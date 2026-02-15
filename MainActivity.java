package com.example.mealmate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mealmate.activities.WelcomeActivity;
import com.example.mealmate.ui.My_Cart;
import com.example.mealmate.ui.dailymeal.Daily_Meal;
import com.example.mealmate.ui.favourite.Favourite;
import com.example.mealmate.ui.home.Home;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    TextView t;
    NavigationView navigationView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        t = findViewById(R.id.toolbar_txt);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.closeDrawer(GravityCompat.START);
        fragmentR(new Home());
        t.setText("MealMate");
        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    fragmentR(new Home());
                    t.setText("Home");
                    break;
                case R.id.nav_daily_meal:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    fragmentR(new Daily_Meal());
                    t.setText("Daily Meal");
                    break;
                case R.id.nav_favourite:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    fragmentR(new Favourite());
                    t.setText("Favourite");
                    break;
                case R.id.nav_my_cart:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    fragmentR(new My_Cart());
                    t.setText("My Cart");
                    break;
            }
            return true;
        });

    }

    private  void fragmentR(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
    public void logout(View view){
        Intent i = new Intent(getApplicationContext(), WelcomeActivity.class);
        startActivity(i);
    }

}
