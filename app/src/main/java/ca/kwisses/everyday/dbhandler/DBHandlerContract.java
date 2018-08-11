package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;

public interface DBHandlerContract {

    interface Object {

        void createDB();

        void executeQuery();

        ContentValues getContentValues();

        void getDataFromDatabase(); // Change void to a return value

        void parseIDs(String[] ids);

        void parseDatabase();

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
