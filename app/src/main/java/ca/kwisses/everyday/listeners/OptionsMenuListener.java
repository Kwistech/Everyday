package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

import ca.kwisses.everyday.R;

public class OptionsMenuListener implements ListenerContract.OptionsMenu {

    private Context context;
    private View view;
    private PopupMenu popupMenu;

    public OptionsMenuListener(Context context, View view) {
        this.context = context;
        this.view = view;
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
    public void setPopupMenu() {
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
        EditText textField = view.findViewById(R.id.addTextField);
        String text = textField.getText().toString();
        //CheckBox
    }

    @Override
    public void deleteTaskItemFromList() {
        System.out.println("Deleting!");
    }
}
