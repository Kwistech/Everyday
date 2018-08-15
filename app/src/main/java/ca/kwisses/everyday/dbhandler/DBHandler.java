package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper implements DBHandlerContract.Object {

    // Database info
    private SQLiteDatabase database;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userData.db";
    private final String TABLE_NAME = "userData";

    // Database column ids
    private final int NUM_OF_COLUMNS = 6;
    private static final String ID = "_id";
    private static final String ITEM_ONE = "_item_one";
    private static final String ITEM_TWO = "_item_two";
    private static final String ITEM_THREE = "_item_three";
    private static final String ITEM_FOUR = "_item_four";
    private static final String ITEM_FIVE = "_item_five";

    // Initial database objects
    private String query;
    private ContentValues values;
    private Cursor cursor;

    public DBHandler(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
        initQuery();
        setContentValues(new ContentValues());
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        setDatabase(db);
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
    public void parseItems(ContentValues contentValues, String[] items) {
        contentValues.put(ID, items[0]);
        contentValues.put(ITEM_ONE, items[1]);
        contentValues.put(ITEM_TWO, items[2]);
        contentValues.put(ITEM_THREE, items[3]);
        contentValues.put(ITEM_FOUR, items[4]);
        contentValues.put(ITEM_FIVE, items[5]);
    }

    @Override
    public List<String[]> getDataFromDatabase(SQLiteDatabase db) {
        List<String[]> allData = new ArrayList<>();
        String dbQuery = "SELECT * FROM " + TABLE_NAME + " WHERE 1";

        // Cursor point to a location in results
        cursor = db.rawQuery(dbQuery, null);
        cursor.moveToFirst(); // Move to the first row in results

        while(!cursor.isAfterLast()) {
            String[] dailyData = new String[NUM_OF_COLUMNS];

            if(cursor.getString(cursor.getColumnIndex(ID)) != null) {
                dailyData[0] = cursor.getString(cursor.getColumnIndex(ID));
            }
            if(cursor.getString(cursor.getColumnIndex(ITEM_ONE)) != null) {
                dailyData[1] = cursor.getString(cursor.getColumnIndex(ITEM_ONE));
            }
            if(cursor.getString(cursor.getColumnIndex(ITEM_TWO)) != null) {
                dailyData[2] = cursor.getString(cursor.getColumnIndex(ITEM_TWO));
            }
            if(cursor.getString(cursor.getColumnIndex(ITEM_THREE)) != null) {
                dailyData[3] = cursor.getString(cursor.getColumnIndex(ITEM_THREE));
            }
            if(cursor.getString(cursor.getColumnIndex(ITEM_FOUR)) != null) {
                dailyData[4] = cursor.getString(cursor.getColumnIndex(ITEM_FOUR));
            }
            if(cursor.getString(cursor.getColumnIndex(ITEM_FIVE)) != null) {
                dailyData[4] = cursor.getString(cursor.getColumnIndex(ITEM_FIVE));
            }

            allData.add(dailyData);
            cursor.moveToNext();
        }

        db.close();
        return allData;
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
    public void setContentValues(ContentValues contentValues) {
        this.values = contentValues;
    }

    @Override
    public SQLiteDatabase getDatabase() {
        return database;
    }

    @Override
    public void setDatabase(SQLiteDatabase db) {
        this.database = db;
    }

    @Override
    public Cursor getCursor() {
        return cursor;
    }

    @Override
    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }
}
