package ca.kwisses.everyday.main;

import android.content.Context;

import ca.kwisses.everyday.listeners.HeaderListener;
import ca.kwisses.everyday.listeners.ListListener;
import ca.kwisses.everyday.listeners.MenuListener;

public class MainActivityListener implements MainContract.Listener {

    private Context context;

    private HeaderListener headerListener;
    private ListListener listListener;
    private MenuListener menuListener;

    protected MainActivityListener(Context context) {
        this.context = context;
        initListeners(this.context);
    }

    @Override
    public void initListeners(Context context) {
        headerListener = new HeaderListener(context);
        listListener = new ListListener(context);
        menuListener = new MenuListener(context);
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
