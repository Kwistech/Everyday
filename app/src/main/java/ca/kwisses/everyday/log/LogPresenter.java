package ca.kwisses.everyday.log;

import java.util.Date;
import java.util.List;

import ca.kwisses.everyday.list.ListItem;

public class LogPresenter implements LogContract.Presenter {

    private Log log;

    public LogPresenter(Log log) {
        this.log = log;
    }

    @Override
    public void addToLog(List<String> list) {

    }

    @Override
    public Log getLog() {
        return log;
    }

    @Override
    public void setLog(Log log) {

    }

    @Override
    public boolean isValidListItem(ListItem listItem) {
        return false;
    }

    @Override
    public Date getCurrentDate() {
        return null;
    }
}
