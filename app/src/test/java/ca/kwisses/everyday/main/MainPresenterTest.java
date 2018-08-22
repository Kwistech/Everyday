package ca.kwisses.everyday.main;

import org.junit.Before;
import org.junit.Test;

import ca.kwisses.everyday.dbhandler.DBHandler;
import ca.kwisses.everyday.dbhandler.DBHandlerPresenter;
import ca.kwisses.everyday.log.Log;
import ca.kwisses.everyday.log.LogPresenter;
import ca.kwisses.everyday.settings.Settings;
import ca.kwisses.everyday.settings.SettingsPresenter;
import ca.kwisses.everyday.user.User;
import ca.kwisses.everyday.user.UserPresenter;

import static junit.framework.Assert.assertNotNull;

public class MainPresenterTest {

    private MainPresenter mainPresenter;

    @Before
    public void setup() {
        mainPresenter = new MainPresenter(null, null);
    }

    // initObjects() TestMethods

    @Test
    public void initObjects_GetUser_UserNotNull() {
        UserPresenter userPresenter = mainPresenter.getUserPresenter();
        User user = userPresenter.getUser();
        assertNotNull(user);
    }

    @Test
    public void initObjects_GetLog_LogNotNull() {
        LogPresenter logPresenter = mainPresenter.getLogPresenter();
        Log log = logPresenter.getLog();
        assertNotNull(log);
    }

    @Test
    public void initObjects_GetSettings_SettingsNotNull() {
        SettingsPresenter settingsPresenter = mainPresenter.getSettingsPresenter();
        Settings settings = settingsPresenter.getSettings();
        assertNotNull(settings);
    }

    @Test
    public void initObjects_GetDBHandler_DBHandlerNotNull() {
        DBHandlerPresenter dbHandlerPresenter = mainPresenter.getDBHandlerPresenter();
        DBHandler dbHandler = dbHandlerPresenter.getDBHandler();
        assertNotNull(dbHandler);
    }

    // initPresenters() Test Methods

    @Test
    public void initPresenters_InitUserPresenter_UserPresenterNotNull() {
        assertNotNull(mainPresenter.getUserPresenter());
    }

    @Test
    public void initPresenters_InitLogPresenter_LogPresenterNotNull() {
        assertNotNull(mainPresenter.getLogPresenter());
    }

    @Test
    public void initPresenters_InitSettingsPresenter_SettingsPresenterNotNull() {
        assertNotNull(mainPresenter.getSettingsPresenter());
    }

    @Test
    public void initPresenters_InitDBHandlerPresenter_DBHandlerPresenterNotNull() {
        assertNotNull(mainPresenter.getDBHandlerPresenter());
    }

}
