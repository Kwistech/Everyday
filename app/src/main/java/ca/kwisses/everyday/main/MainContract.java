package ca.kwisses.everyday.main;

import android.content.Context;

import ca.kwisses.everyday.checkbox_list.CheckBoxListHandler;
import ca.kwisses.everyday.dbhandler.DBHandlerPresenter;
import ca.kwisses.everyday.listeners.HeaderListener;
import ca.kwisses.everyday.listeners.ListListener;
import ca.kwisses.everyday.listeners.MenuListener;
import ca.kwisses.everyday.listeners.OptionsMenuListener;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.UserPresenter;

public interface MainContract {


    interface View {

        void setObjectViews(MainPresenter mainPresenter);

    }

    interface Presenter {

        void initObjects();

        void initPresenters();

        UserPresenter getUserPresenter();

        void setUserPresenter(UserPresenter userPresenter);

        LogPresenter getLogPresenter();

        void setLogPresenter(LogPresenter logPresenter);

        SettingsPresenter getSettingsPresenter();

        void setSettingsPresenter(SettingsPresenter settingsPresenter);

        DBHandlerPresenter getDBHandlerPresenter();

        void setDBHandlerPresenter(DBHandlerPresenter dbHandlerPresenter);

        CheckBoxListHandler getCheckBoxListHandler();

        void setCheckBoxListHandler(CheckBoxListHandler checkBoxListHandler);

    }

    interface Listener {

        // onClickListeners for MainActivity views
        void initListeners(Context context);

        HeaderListener getHeaderListener();

        ListListener getListListener();

        MenuListener getMenuListener();

        OptionsMenuListener getOptionsMenuListener();

    }
}
