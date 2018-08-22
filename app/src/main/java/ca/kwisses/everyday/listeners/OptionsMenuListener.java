package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import ca.kwisses.everyday.R;
import ca.kwisses.everyday.checkbox_list.CheckBoxListHandler;

public class OptionsMenuListener implements ListenerContract.OptionsMenu {

    private Context context;
    private View view;
    private CheckBoxListHandler checkBoxListHandler;

    private PopupMenu popupMenu;

    public OptionsMenuListener(Context context, View view, CheckBoxListHandler checkBoxListHandler) {
        this.context = context;
        this.view = view;
        this.checkBoxListHandler = checkBoxListHandler;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        String task = getAddTextFieldString();

        if(task.length() == 0) {
            Toast.makeText(context, "Please enter a task!", Toast.LENGTH_LONG).show();
            return false;
        }

        switch(item.getItemId()) {
            case R.id.addTaskButton:
                return addTask(task);

            case R.id.deleteTaskButton:
                checkBoxListHandler.deleteTaskItemFromList();
                return true;
        }
        return false;
    }

    @Override
    public boolean addTask(String task) {
        if(checkBoxListHandler.addTaskItemToList(task)) {
            Toast.makeText(context, "Added!", Toast.LENGTH_LONG).show();
            return true;
        } else {
            if(checkBoxListHandler.taskExists(task)) {
                Toast.makeText(context, "Task already exists!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, "List is full!", Toast.LENGTH_LONG).show();
            }
            return false;
        }
    }

    @Override
    public boolean deleteTask(String text) {
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
    public String getAddTextFieldString() {
        EditText textField = view.findViewById(R.id.addTextField);
        return textField.getText().toString();
    }
}
