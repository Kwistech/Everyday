package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;

public interface ListenerContract {

    interface Header extends View.OnClickListener {

        Context getContext();

        void setContext(Context context);

        PopupMenu getPopupMenu();

        void initPopupMenu();

    }

    interface _List extends View.OnClickListener {


    }

    interface Menu extends View.OnClickListener {


    }

    interface OptionsMenu extends PopupMenu.OnMenuItemClickListener {

        boolean isValidTask(String task);

        boolean addTask(String text);

        boolean deleteTask(String text);

        PopupMenu getPopupMenu();

        void setPopupMenu();

        String getAddTextFieldString();

    }

}
