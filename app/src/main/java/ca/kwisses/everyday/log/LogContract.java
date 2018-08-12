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

        List< List<ListItem> > get(); // change return value

        void setLog(List< List<ListItem> > log);

        List<ListItem> getList();

        void setList(List<ListItem> list);

    }

    interface Presenter {

        Log getLog();

        void setLog(Log log);

        boolean addToLog(List<ListItem> listItem);

        boolean isValidListItem(List<ListItem> listItem);

        String getCurrentDate();

    }

    interface Listener {

        void onTouchBackButton(View view);

    }

}
