package ca.kwisses.everyday.log;

import java.util.Date;
import java.util.List;

import ca.kwisses.everyday.dbhandler.DBHandler;

public interface LogContract {

    interface View {

        void setObjectViews();

        void setTitle(String title);

        DBHandler getDBHandler();

        void setDBHandler(DBHandler dbHandler);

        void show();

    }

    interface Object {

    }

    interface Presenter {

        Log getLog();

        void setLog(Log log);

        String getCurrentDate();

    }

    interface Listener {

        void onTouchBackButton(View view);

    }

}
