package ca.kwisses.everyday.main;

import ca.kwisses.everyday.dbhandler.DBHandler;
import ca.kwisses.everyday.list.ListItemPresenter;
import ca.kwisses.everyday.list.ListPresenter;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.UserPresenter;

public interface MainContract {


    interface View {

        void setObjectViews(MainPresenter mainPresenter);

        String getTitle();

        void setTitle(String title);

    }

    interface Presenter {

        UserPresenter getUserPresenter();

        void setUserPresenter(UserPresenter userPresenter);

        ListPresenter getListPresenter();

        void setListPresenter(ListPresenter listPresenter);

        ListItemPresenter getListItemPresenter();

        void setListItemPresenter(ListItemPresenter listItemPresenter);

        LogPresenter getLogPresenter();

        void setLogPresenter(LogPresenter logPresenter);

        SettingsPresenter getSettingsPresenter();

        void setSettingsPresenter(SettingsPresenter settingsPresenter);

        DBHandler getDBHandler();

        void setDBHandler(DBHandler dbHandler);

    }
}
