package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public interface DBHandlerContract {

    interface Object {

        void initQuery();

        void parseItems(String[] items);

        void parseDatabase();

        String getQuery();

        ContentValues getContentValues();

        void getDataFromDatabase(); // Change void to a return value

    }

    interface Presenter {

        void setIDs(String[] ids);

        String[] getIDs();

        boolean isValidQuery(String query);

        boolean isValidID(String id);

        DBHandler getDBHandler();

        void setDBHandler(DBHandler dbHandler);
    }

}
