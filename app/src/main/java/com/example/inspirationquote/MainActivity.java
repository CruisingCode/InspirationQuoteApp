package com.example.inspirationquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity {

//url address
    private String API = "https://api.chucknorris.io/jokes/random?category=dev";

    //button

    Button pressJoke;
    TextView randomJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomJoke = (TextView)findViewById(R.id.textView);
        pressJoke = (Button)findViewById(R.id.button);

        pressJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AsyncTask<String,Void,String> asyncTask = new AsyncTask<String, Void, String>() {
                    @Override
                    protected String doInBackground(String... strings) {
                        Helper helper = new Helper();
                        return  helper.getHTTPData(API);


                    }


                };

               asyncTask.execute();
            }
        });

    }
}
