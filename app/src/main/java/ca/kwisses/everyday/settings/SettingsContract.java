package ca.kwisses.everyday.settings;

import java.util.List;

public interface SettingsContract {

    interface Object {

        void setAutoClear(boolean autoClear);

        boolean isAutoCleared();

    }

    interface Presenter {

        void clearAllListItemChecks(List<List> list);

        Settings getSettings();

    }
}
