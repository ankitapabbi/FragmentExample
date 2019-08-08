package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//import android.app.Fragment;
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btnfragment1);
        btn2 = (Button)findViewById(R.id.btnFragment2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(view);
            }
        });
    }

//    @Override
//    public void onClick(View view) {
//        changeFragment(view);
//
//    }
   public void changeFragment(View view){

       Fragment fragment;

        if (view == findViewById(R.id.btnfragment1)){

        fragment = new fragmentOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.linearLayout,fragment);
        ft.commit();

        }
        if (view == findViewById(R.id.btnFragment2)){
        fragment = new fragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.linearLayout,fragment);
            ft.commit();

        }
    }


}
