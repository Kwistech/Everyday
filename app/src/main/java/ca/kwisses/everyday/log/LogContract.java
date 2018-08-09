package ca.kwisses.everyday.log;

import java.util.Date;
import java.util.List;

import ca.kwisses.everyday.list.ListItem;

public interface LogContract {

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
}
