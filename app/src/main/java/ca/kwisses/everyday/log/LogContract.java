package ca.kwisses.everyday.log;

import java.util.Date;
import java.util.List;

import ca.kwisses.everyday.dbhandler.DBHandler;
import ca.kwisses.everyday.list.ListItem;

public interface LogContract {

    interface View {

        void setObjectViews();

        void setTitle(String title);

        DBHandler getDBHandler();

        void setDBHandler(DBHandler dbHandler);

        void show();

    }

    interface Object {

        Log getLog();

        void setLog(Log log);

        List<String> getList();

        void setList(List<String> list);

    }

    interface Presenter {

        void addToLog(List<String> list);

        Log getLog();

        void setLog(Log log);

        boolean isValidListItem(ListItem listItem);

        Date getCurrentDate();

    }

    interface Listener {

        void onTouchBackButton(View view);

    }

}
