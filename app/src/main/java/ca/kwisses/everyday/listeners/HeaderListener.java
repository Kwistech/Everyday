package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

import ca.kwisses.everyday.R;

public class HeaderListener implements ListenerContract.Header {

    private Context context;
    private PopupMenu popupMenu;
    private OptionsMenuListener optionsMenuListener;

    public HeaderListener(Context context, View view, OptionsMenuListener optionsMenuListener) {
        this.context = context;
        this.optionsMenuListener = optionsMenuListener;
        initPopupMenu(view);
    }

    @Override
    public void onClick(View view) {
        initPopupMenu(view);

        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, popupMenu.getMenu());

        popupMenu.show();
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public PopupMenu getPopupMenu() {
        return popupMenu;
    }

    @Override
    public void initPopupMenu(View view) {
        this.optionsMenuListener.setPopupMenu(view);
        this.popupMenu = this.optionsMenuListener.getPopupMenu();
    }
}
