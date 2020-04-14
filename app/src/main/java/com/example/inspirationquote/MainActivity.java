package com.example.inspirationquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity {

    //url address
    private String API = "https://api.chucknorris.io/jokes/random?category=dev";



    Button pressJoke;
    TextView randomJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomJoke = (TextView) findViewById(R.id.textView);
        pressJoke = (Button) findViewById(R.id.button);

        //call API from web when clicking button
        pressJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create asynctask to connect to url/
                AsyncTask<Void, Void, String> GetJokes = new AsyncTask<Void, Void, String>() {

                    //connect to url
                    @Override
                    protected String doInBackground(Void... voids) {
                        Helper helper = new Helper();
                        return helper.getHTTPData(API);
                    }

                    //get joke from response and set to the textview
                    @Override
                    protected void onPostExecute(String s) {
                        Jokes jokes = new Gson().fromJson(s, Jokes.class);
                        randomJoke.setText(jokes.getValue());
                        if (randomJoke.getVisibility() == View.INVISIBLE)
                            randomJoke.setVisibility(View.VISIBLE);
                        super.onPostExecute(s);
                    }

                };

                GetJokes.execute();

            }


        });
    }


}



