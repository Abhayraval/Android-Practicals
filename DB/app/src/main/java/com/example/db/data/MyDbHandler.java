package com.example.db.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.db.model.Contacts;
import com.example.db.params.Params;

public class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(Context context) {
        super(context, Params.DB_NAME,  null, Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE" + Params.TABLE_NAME + "(" +
                Params.KEY_ID + "INTEGER PRIMARY KEY" + Params.KEY_NAME +
                "TEXT" + Params.KEY_PHONE + "TEXT" + ")";
        Log.d("MyDB", "Query Being Run is:" + create);
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public void addContact(Contacts contacts){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Params.KEY_NAME, contacts.getName());
        values.put(Params.KEY_PHONE, contacts.getPhoneNumber());

        db.insert(Params.TABLE_NAME, null, values);
        Log.d("MyDB", "Successfully inserted");
        db.close();
    }
}
