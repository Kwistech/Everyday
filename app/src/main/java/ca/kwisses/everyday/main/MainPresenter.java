package ca.kwisses.everyday.main;

import ca.kwisses.everyday.dbhandler.DBHandler;
import ca.kwisses.everyday.dbhandler.DBHandlerPresenter;
import ca.kwisses.everyday.list.ListItem;
import ca.kwisses.everyday.list.ListItemPresenter;
import ca.kwisses.everyday.list.ListPresenter;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.Settings;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.User;
import ca.kwisses.everyday.user.UserPresenter;

public class MainPresenter implements MainContract.Presenter {

    private User user;
    private ListItem listItem;
    private Log log;
    private Settings settings;
    private DBHandler dbHandler;

    private UserPresenter userPresenter;
    private ListPresenter listPresenter;
    private ListItemPresenter listItemPresenter;
    private LogPresenter logPresenter;
    private SettingsPresenter settingsPresenter;
    private DBHandlerPresenter dbHandlerPresenter;

    MainPresenter() {
        initObjects();
        initPresenters();
    }

    @Override
    public void initObjects() {
        user = new User();
        listItem = new ListItem();
        log = new Log();
        settings = new Settings();
        dbHandler = new DBHandler();
    }

    @Override
    public void initPresenters() {
        userPresenter = new UserPresenter(user);
        listPresenter = new ListPresenter();
        listItemPresenter = new ListItemPresenter(listItem);
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
    public ListPresenter getListPresenter() {
        return listPresenter;
    }

    @Override
    public void setListPresenter(ListPresenter listPresenter) {
        this.listPresenter = listPresenter;
    }

    @Override
    public ListItemPresenter getListItemPresenter() {
        return listItemPresenter;
    }

    @Override
    public void setListItemPresenter(ListItemPresenter listItemPresenter) {
        this.listItemPresenter = listItemPresenter;
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
}
