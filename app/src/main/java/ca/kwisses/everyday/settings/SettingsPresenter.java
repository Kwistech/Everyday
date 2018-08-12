package ca.kwisses.everyday.settings;

import java.util.List;

public class SettingsPresenter implements SettingsContract.Presenter {

    private Settings settings;

    public SettingsPresenter(Settings settings) {
        this.settings = settings;
    }

    @Override
    public boolean clearAllListItemChecks(List<List> list) {
        // Add implementation here.
        return false;
    }

    @Override
    public Settings getSettings() {
        return settings;
    }
}
