package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public interface DBHandlerContract {

    interface Object {

        void initQuery();

        void parseItems(ContentValues contentValues, String[] items);

        List<String[]> getDataFromDatabase(SQLiteDatabase db);

        String[] getRowData(Cursor cursor);

        String getQuery();

        ContentValues getContentValues();

        void setContentValues(ContentValues contentValues);

        SQLiteDatabase getDatabase();

        void setDatabase(SQLiteDatabase db);

        Cursor getCursor();

        void setCursor(Cursor cursor);

    }

    interface Presenter {

        void setIDs(String[] ids);

        String[] getIDs();

        DBHandler getDBHandler();

        void setDBHandler(DBHandler dbHandler);

        boolean isValidQuery(String query);

        boolean isValidID(String id);

        boolean stringArrayIsOfCertainLength(String[] strings, int length);
    }

}
