package com.example.inspirationquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private String API = "https://api.chucknorris.io/jokes/random?category=dev"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       $.get
        $ curl --request GET \
        --url 'https://api.chucknorris.io/jokes/random?category=dev' \
        --header 'accept: application/json'



    }
}
