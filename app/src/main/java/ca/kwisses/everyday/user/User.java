package ca.kwisses.everyday.user;

import java.util.List;

import ca.kwisses.everyday.list.ListItem;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.main.MainPresenter;
import ca.kwisses.everyday.settings.Settings;

public class User implements UserContract.Object {

    private MainPresenter mainPresenter;
    private Log log;
    private Settings settings;
    private List<ListItem> listItems;

    public User() {

    }

    @Override
    public List<ListItem> getListItems() {
        return listItems;
    }

    @Override
    public void setListItems(List<ListItem> listItems) {
        this.listItems = listItems;
    }

    @Override
    public void setMainPresenter(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public Log getLog() {
        return log;
    }

    @Override
    public Settings getSettings() {
        return settings;
    }

    @Override
    public void setLog(Log log) {
        this.log = log;
    }

    @Override
    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
