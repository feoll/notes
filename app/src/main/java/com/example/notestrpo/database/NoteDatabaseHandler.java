package com.example.notestrpo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.notestrpo.database.NotesDatabaseContract.*;

public class NoteDatabaseHandler extends SQLiteOpenHelper {

    public NoteDatabaseHandler(@Nullable Context context) {
        super(context, NotesDatabaseContract.DB_NAME, null, NotesDatabaseContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TagsContract.CREATE_TABLE);
        sqLiteDatabase.execSQL(NotesContract.CREATE_TABLE);
        sqLiteDatabase.execSQL(NoteTagContract.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(TagsContract.DROP_TABLE);
        sqLiteDatabase.execSQL(NotesContract.DROP_TABLE);
        sqLiteDatabase.execSQL(NoteTagContract.DROP_TABLE);
        onCreate(sqLiteDatabase);
    }
}
