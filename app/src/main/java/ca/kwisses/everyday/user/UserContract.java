package ca.kwisses.everyday.user;

import ca.kwisses.everyday.list.ListItem;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.main.MainPresenter;
import ca.kwisses.everyday.settings.Settings;

public interface UserContract {

    interface Object {

        ListItem getListItems();

        void setListItems(ListItem listItems);

        void setMainPresenter(MainPresenter mainPresenter);

        Log getLog();

        Settings getSettings();

        void setLog(Log log);

        void setSettings(Settings settings);

    }

    interface Presenter {

        User getUser();

        void getUserData(); // Change!!!

        void setUser(User user);

        void setUserData(); // Change!!!

    }
}
