package com.example.lec2recipesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtViewTitle; //cannot call findViewById


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate the button in Java code
        //findViewById cannot be called until setContentView is called
        Button btnShowRecipe = findViewById(R.id.btnShowRecipe);
        txtViewTitle = findViewById(R.id.txtViewTitle); //just to show that you can declare a field and then get its view inside the onCreate method
        
        btnShowRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we start the second activity
                Intent myIntent = new Intent(MainActivity.this, RecipeActivity.class);
                startActivity(myIntent); //start activity with this intent -> start recipe activity
                //at this point control has gone to recipe activity object
            }
        });
    }
}