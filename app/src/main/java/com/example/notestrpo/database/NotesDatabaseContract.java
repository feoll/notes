package com.example.notestrpo.database;

public class NotesDatabaseContract {
    public final static String DB_NAME = "notes.db";
    public final static int DB_VERSION = 1;

    static class TagsContract {
        public final static String TABLE_NAME = "TAGS";

        public final static String _ID = "ID";
        public final static String _TAG = "TAG";

        public final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + _TAG + " TEXT)";

        public final static String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    static class NotesContract {
        public final static String TABLE_NAME = "NOTES";

        public final static String _ID = "ID";
        public final static String _TITLE = "TITLE";
        public final static String _DESCRIPTION = "DESCRIPTION";
        public final static String _COLOR = "COLOR";
        public final static String _CREATED_AT = "CREATED_AT";

        public final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + _TITLE + " TEXT,"
                + _DESCRIPTION + " TEXT,"
                + _COLOR + " INTEGER,"
                + _CREATED_AT  + " TEXT)";

        public final static String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    static class NoteTagContract {
        public final static String TABLE_NAME = "NOTE_TAG";

        public final static String _ID = "ID";
        public final static String _ID_NOTE = "ID_NOTE";
        public final static String _ID_TAG = "ID_TAG";

        public final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + _ID_NOTE + " INTEGER,"
                + _ID_TAG + " INTEGER)";

        public final static String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
