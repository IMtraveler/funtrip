package com.example.user.logintest;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by chentingyu on 2017/8/1.
 */

public class SQLiteHelper extends SQLiteOpenHelper{

  public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
      super(context, name, factory, version);}

  // CREATE  TABLE "main"."attr" ("_id" INTEGER PRIMARY KEY  NOT NULL , "cdate" DATETIME NOT NULL , "info" VARCHAR, "amount" INTEGER) 

  @Override
  public void onCreate (SQLiteDatabase db){

      db.execSQL("CREATE  TABLE main.attr " +
              "(_id INTEGER PRIMARY KEY NOT NULL,"+
              "country VARCHAR NOT NULL, " +
              "name VARCHAR NOT NULL, " +
              "category VARCHAR NOT NULL)"
      );
  }



  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){}
}
