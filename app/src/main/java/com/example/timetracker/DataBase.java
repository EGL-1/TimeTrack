package com.example.timetracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class DataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "track";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "b_track_list";
    private static final String COL_ID = "ID";
    private static final String COL_NAME = "name";
    private static final String COL_TIME = "time";

    public DataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = String.format(
                "CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL %s INTEGER NOT NULL);", TABLE_NAME, COL_ID, COL_NAME, COL_TIME );
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    //Добавление записей
    public void addT(Track track){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        // записываем даннае по отдельной активности
        value.put(COL_NAME, track.getName());
        value.put(COL_TIME, track.getTime());
        db.insertWithOnConflict(
                TABLE_NAME, null, value, SQLiteDatabase.CONFLICT_REPLACE);
    }

    public void delT(String idTrack){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COL_ID + " = ?", new String[]{idTrack});
        db.close();
    }

    public ArrayList<Track> getT(){
        Track track;

        ArrayList<Track> allTrack = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, null);
        while (cursor.moveToNext()){
            int idIndex = cursor.getColumnIndex(COL_ID);
            int nameIndex = cursor.getColumnIndex(COL_NAME);
            int timeIndex = cursor.getColumnIndex(COL_TIME);

            String name = cursor.getString(nameIndex);
            float time = Integer.parseInt(cursor.getString(timeIndex));
            track = new Track(time, name);
            allTrack.add(track);
        }

        cursor.close();
        db.close();
        return allTrack;
    }
}