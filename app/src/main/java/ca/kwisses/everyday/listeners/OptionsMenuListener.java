package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import ca.kwisses.everyday.R;
import ca.kwisses.everyday.checkbox_list.CheckBoxListHandler;

public class OptionsMenuListener implements ListenerContract.OptionsMenu {

    private Context context;
    private View view;
    private CheckBoxListHandler checkBoxListHandler;

    private TextView textField;
    private PopupMenu popupMenu;

    public OptionsMenuListener(Context context, View view, CheckBoxListHandler checkBoxListHandler) {
        this.context = context;
        this.view = view;
        this.checkBoxListHandler = checkBoxListHandler;
        this.textField = this.view.findViewById(R.id.addTextField);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        String task = getAddTextFieldString();

        if(!isValidTask(task)) {
            return false;
        }

        switch(item.getItemId()) {
            case R.id.addTaskButton:
                return addTask(task);

            case R.id.deleteTaskButton:
                return deleteTask(task);
        }
        return false;
    }

    @Override
    public boolean isValidTask(String task) {
        if(task.length() == 0) {
            Toast.makeText(context, R.string.please_enter_a_task, Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    @Override
    public boolean addTask(String task) {
        if(!checkBoxListHandler.taskExists(task) && checkBoxListHandler.addTaskItemToList(task)) {
            Toast.makeText(context, R.string.added, Toast.LENGTH_LONG).show();
            this.textField.setText(null);
            return true;
        } else {
            if(checkBoxListHandler.taskExists(task)) {
                Toast.makeText(context, R.string.task_already_exists, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, R.string.list_is_full, Toast.LENGTH_LONG).show();
            }
            return false;
        }
    }

    @Override
    public boolean deleteTask(String task) {
        if(checkBoxListHandler.deleteTaskItemFromList(task)) {
            Toast.makeText(context, R.string.deleted_task_from_list, Toast.LENGTH_LONG).show();
            this.textField.setText(null);
            return true;
        } else {
            if(!checkBoxListHandler.taskExists(task)) {
                Toast.makeText(context, R.string.task_does_not_exist, Toast.LENGTH_LONG).show();
            }
            return false;
        }
    }

    @Override
    public PopupMenu getPopupMenu() {
        return this.popupMenu;
    }

    @Override
    public void setPopupMenu() {
        ImageButton optionsButton = view.findViewById(R.id.optionsButton);
        popupMenu = new PopupMenu(context, optionsButton);
        popupMenu.setOnMenuItemClickListener(this);
    }

    @Override
    public String getAddTextFieldString() {
        return this.textField.getText().toString();
    }
}
