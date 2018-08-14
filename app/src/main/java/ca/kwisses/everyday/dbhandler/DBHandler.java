package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper implements DBHandlerContract.Object {

    // Database info
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userData.db";
    private final String TABLE_NAME = "userData";

    // Database column ids
    private static final String ID = "_id";
    private static final String ITEM_ONE = "_item_one";
    private static final String ITEM_TWO = "_item_two";
    private static final String ITEM_THREE = "_item_three";
    private static final String ITEM_FOUR = "_item_four";
    private static final String ITEM_FIVE = "_item_five";

    // Initial query
    private String query;
    private ContentValues values;

    public DBHandler(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
        initQuery();
        values = new ContentValues();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void initQuery() {
        query = "CREATE TABLE " + TABLE_NAME + "(" +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                ITEM_ONE + " TEXT, " +
                ITEM_TWO + " TEXT, " +
                ITEM_THREE + " TEXT, " +
                ITEM_FOUR + " TEXT " +
                ITEM_FIVE + " TEXT " + ");";
    }

    @Override
    public void parseItems(String[] items) {
        values.put(ID, items[0]);
        values.put(ITEM_ONE, items[1]);
        values.put(ITEM_TWO, items[2]);
        values.put(ITEM_THREE, items[3]);
        values.put(ITEM_FOUR, items[4]);
        values.put(ITEM_FIVE, items[5]);
    }

    @Override
    public void parseDatabase() {

    }

    @Override
    public String getQuery() {
        return query;
    }

    @Override
    public ContentValues getContentValues() {
        return values;
    }

    @Override
    public void getDataFromDatabase() {

    }
}
