package ca.kwisses.everyday.main;

import ca.kwisses.everyday.dbhandler.DBHandlerPresenter;
import ca.kwisses.everyday.list.ListItemPresenter;
import ca.kwisses.everyday.list.ListPresenter;
import ca.kwisses.everyday.listeners.HeaderListener;
import ca.kwisses.everyday.listeners.ListListener;
import ca.kwisses.everyday.listeners.MenuListener;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.UserPresenter;

public interface MainContract {


    interface View {

        void setObjectViews(MainPresenter mainPresenter);

        String getViewTitle();

        void setTitle(String title);

    }

    interface Presenter {

        void initObjects();

        void initPresenters();

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

        DBHandlerPresenter getDBHandlerPresenter();

        void setDBHandlerPresenter(DBHandlerPresenter dbHandlerPresenter);

    }

    interface Listener {

        // onClickListeners for MainActivity views
        void initListeners();

        HeaderListener getHeaderListener();

        ListListener getListListener();

        MenuListener getMenuListener();

    }
}
