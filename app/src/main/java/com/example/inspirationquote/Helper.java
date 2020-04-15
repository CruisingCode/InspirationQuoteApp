package com.example.inspirationquote;

import org.apache.commons.lang3.ObjectUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Helper {


    static String stream= null;


    public Helper(){

    }



public String getHTTPData(String urlString){

//initaitte connection to internet, send request, read response and build string

        try{
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            if(urlConnection.getResponseCode() == 200){
                BufferedReader r = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder b = new StringBuilder();
                String line;
                while((line = r.readLine()) != null){
                    b.append(line);
                }
                //print out response as string and disconnect from internet

                stream = b.toString();
                urlConnection.disconnect();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
}



}
