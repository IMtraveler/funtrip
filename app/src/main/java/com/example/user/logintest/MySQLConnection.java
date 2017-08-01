package com.example.user.logintest;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by chentingyu on 2017/8/1.
 */

public class MySQLConnection {
  public static String executeQuery() {
      String result = "";
      HttpURLConnection urlConnection=null;
      InputStream is =null;
      try {
          URL url=new URL("http://140.112.107.125:47155/html/test.php");
          urlConnection=(HttpURLConnection) url.openConnection();
          urlConnection.setRequestMethod("POST");
          urlConnection.connect();
          is=urlConnection.getInputStream();

          BufferedReader bufReader = new BufferedReader(new InputStreamReader(is, "utf-8"), 8);
          StringBuilder builder = new StringBuilder();
          String line = null;
          while((line = bufReader.readLine()) != null) {
              builder.append(line + "\n");
          }
          is.close();
          result = builder.toString();
      } catch(Exception e) {
          Log.e("log_tag", e.toString());
      }

      return result;
  }
}
