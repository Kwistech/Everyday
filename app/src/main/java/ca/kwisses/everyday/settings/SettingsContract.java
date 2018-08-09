package ca.kwisses.everyday.settings;

import java.util.List;

public interface SettingsContract {

    interface View {

        void setAutoClear(boolean autoClear);

        boolean isAutoCleared();

    }

    interface Presenter {

        void clearAllListItemChecks(List<List> list);

    }
}
