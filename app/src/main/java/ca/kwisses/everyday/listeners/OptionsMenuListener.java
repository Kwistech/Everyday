package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import ca.kwisses.everyday.R;

public class OptionsMenuListener implements ListenerContract.OptionsMenu {

    private Context context;
    private PopupMenu popupMenu;

    public OptionsMenuListener(Context context) {
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        System.out.println("Clicked!");
        switch(item.getItemId()) {
            case R.id.addTaskButton:
                addTaskItemToList();
                return true;

            case R.id.deleteTaskButton:
                deleteTaskItemFromList();
                return true;
        }
        return false;
    }

    @Override
    public void setPopupMenu(View view) {
        ImageButton optionsButton = view.findViewById(R.id.optionsButton);
        popupMenu = new PopupMenu(context, optionsButton);
        popupMenu.setOnMenuItemClickListener(this);
    }

    @Override
    public PopupMenu getPopupMenu() {
        return this.popupMenu;
    }

    @Override
    public void addTaskItemToList() {
        System.out.println("Adding!");
    }

    @Override
    public void deleteTaskItemFromList() {
        System.out.println("Deleting!");
    }
}
