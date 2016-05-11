package com.wizardlyshop.foodmaster;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class FMSQLiteOpenHelper extends SQLiteOpenHelper{
	public FMSQLiteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}
	public void onCreate(SQLiteDatabase db) {
        String query="create table favorites(_foodcode text primary key);";
        db.execSQL(query);
    }
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
