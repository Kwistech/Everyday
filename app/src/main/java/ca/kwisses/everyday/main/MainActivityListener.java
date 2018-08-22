package ca.kwisses.everyday.main;

import android.content.Context;
import android.view.View;

import ca.kwisses.everyday.checkbox_list.CheckBoxListHandler;
import ca.kwisses.everyday.listeners.HeaderListener;
import ca.kwisses.everyday.listeners.ListListener;
import ca.kwisses.everyday.listeners.MenuListener;
import ca.kwisses.everyday.listeners.OptionsMenuListener;

public class MainActivityListener implements MainContract.Listener {

    private Context context;
    private View view;

    private CheckBoxListHandler checkBoxListHandler;

    private HeaderListener headerListener;
    private ListListener listListener;
    private MenuListener menuListener;
    private OptionsMenuListener optionsMenuListener;

    protected MainActivityListener(Context context, View view) {
        this.context = context;
        this.view = view;

        initListeners(this.context);
    }

    @Override
    public void initListeners(Context context) {
        checkBoxListHandler = new CheckBoxListHandler(view);

        optionsMenuListener = new OptionsMenuListener(context, view, checkBoxListHandler);
        headerListener = new HeaderListener(context, view, optionsMenuListener);
        listListener = new ListListener(context);
        menuListener = new MenuListener(context);
    }

    @Override
    public CheckBoxListHandler getCheckBoxListHandler() {
        return this.checkBoxListHandler;
    }

    @Override
    public HeaderListener getHeaderListener() {
        return this.headerListener;
    }

    @Override
    public ListListener getListListener() {
        return this.listListener;
    }

    @Override
    public MenuListener getMenuListener() {
        return this.menuListener;
    }

    @Override
    public OptionsMenuListener getOptionsMenuListener() {
        return this.optionsMenuListener;
    }

}
