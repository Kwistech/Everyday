package ca.kwisses.everyday.user;

import ca.kwisses.everyday.list.ListItem;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.main.MainPresenter;
import ca.kwisses.everyday.settings.Settings;

public class User implements UserContract.Object {

    public User() {

    }

    @Override
    public ListItem getListItems() {
        return null;
    }

    @Override
    public void setListItems(ListItem listItems) {

    }

    @Override
    public void setMainPresenter(MainPresenter mainPresenter) {

    }

    @Override
    public Log getLog() {
        return null;
    }

    @Override
    public Settings getSettings() {
        return null;
    }

    @Override
    public void setLog(Log log) {

    }

    @Override
    public void setSettings(Settings settings) {

    }
}
