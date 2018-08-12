package ca.kwisses.everyday.log;

import java.util.List;

import ca.kwisses.everyday.list.ListItem;

public class Log implements LogContract.Object {

    private List<ListItem> listItems;
    private List< List<ListItem> > log;

    public Log() {

    }

    @Override
    public List< List<ListItem> > get() {
        return log;
    }

    @Override
    public void setLog(List< List<ListItem> > log) {
        this.log = log;
    }

    @Override
    public List<ListItem> getList() {
        return listItems;
    }

    @Override
    public void setList(List<ListItem> listItem) {
        this.listItems = listItem;
    }
}
