package ca.kwisses.everyday.main;

import ca.kwisses.everyday.listeners.HeaderListener;
import ca.kwisses.everyday.listeners.ListListener;
import ca.kwisses.everyday.listeners.MenuListener;

public class MainActivityListener implements MainContract.Listener {

    private HeaderListener headerListener;
    private ListListener listListener;
    private MenuListener menuListener;

    public MainActivityListener() {
        initListeners();
    }

    @Override
    public void initListeners() {
        headerListener = new HeaderListener();
        listListener = new ListListener();
        menuListener = new MenuListener();
    }

    @Override
    public HeaderListener getHeaderListener() {
        return headerListener;
    }

    @Override
    public ListListener getListListener() {
        return listListener;
    }

    @Override
    public MenuListener getMenuListener() {
        return menuListener;
    }
}
