package ca.kwisses.everyday.main;

import android.content.Context;

import ca.kwisses.everyday.checkbox_list.CheckBoxListHandler;
import ca.kwisses.everyday.dbhandler.DBHandler;
import ca.kwisses.everyday.dbhandler.DBHandlerPresenter;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.Settings;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.User;
import ca.kwisses.everyday.user.UserPresenter;

public class MainPresenter implements MainContract.Presenter {

    private Context context;

    private User user;
    private Log log;
    private Settings settings;
    private DBHandler dbHandler;

    private CheckBoxListHandler checkBoxListHandler;

    private UserPresenter userPresenter;
    private LogPresenter logPresenter;
    private SettingsPresenter settingsPresenter;
    private DBHandlerPresenter dbHandlerPresenter;

    MainPresenter(Context context) {
        this.context = context;
        initObjects();
        initPresenters();
    }

    @Override
    public void initObjects() {
        user = new User();
        log = new Log();
        settings = new Settings();
        dbHandler = new DBHandler(context, null);
        checkBoxListHandler = new CheckBoxListHandler();
    }

    @Override
    public void initPresenters() {
        userPresenter = new UserPresenter(user);
        logPresenter = new LogPresenter(log);
        settingsPresenter = new SettingsPresenter(settings);
        dbHandlerPresenter = new DBHandlerPresenter(dbHandler);
    }

    @Override
    public UserPresenter getUserPresenter() {
        return userPresenter;
    }

    @Override
    public void setUserPresenter(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
    }

    @Override
    public LogPresenter getLogPresenter() {
        return logPresenter;
    }

    @Override
    public void setLogPresenter(LogPresenter logPresenter) {
        this.logPresenter = logPresenter;
    }

    @Override
    public SettingsPresenter getSettingsPresenter() {
        return settingsPresenter;
    }

    @Override
    public void setSettingsPresenter(SettingsPresenter settingsPresenter) {
        this.settingsPresenter = settingsPresenter;
    }

    @Override
    public DBHandlerPresenter getDBHandlerPresenter() {
        return dbHandlerPresenter;
    }

    @Override
    public void setDBHandlerPresenter(DBHandlerPresenter dbHandlerPresenter) {
        this.dbHandlerPresenter = dbHandlerPresenter;
    }

    @Override
    public CheckBoxListHandler getCheckBoxListHandler() {
        return this.checkBoxListHandler;
    }

    @Override
    public void setCheckBoxListHandler(CheckBoxListHandler checkBoxListHandler) {
        this.checkBoxListHandler = checkBoxListHandler;
    }
}
