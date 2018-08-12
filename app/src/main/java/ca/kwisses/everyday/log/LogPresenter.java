package ca.kwisses.everyday.log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import ca.kwisses.everyday.list.ListItem;

public class LogPresenter implements LogContract.Presenter {

    private Log log;

    public LogPresenter(Log log) {
        this.log = log;
    }

    @Override
    public Log getLog() {
        return log;
    }

    @Override
    public void setLog(Log log) {
        this.log = log;
    }

    @Override
    public boolean addToLog(List<ListItem> listItem) {
        List< List<ListItem> > logListItems = log.get();
        int previousSize = logListItems.size();

        if(isValidListItem(listItem)) {
            logListItems.add(listItem);
            log.setLog(logListItems);
        }

        return logListItems.size() > previousSize;
    }

    @Override
    public boolean isValidListItem(List<ListItem> listItem) {
        return listItem.size() != 0;
    }

    @Override
    public String getCurrentDate() {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.CANADA);
        return df.format(c);
    }
}
