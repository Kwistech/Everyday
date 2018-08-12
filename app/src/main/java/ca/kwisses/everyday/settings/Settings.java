package ca.kwisses.everyday.settings;

public class Settings implements SettingsContract.Object {

    private boolean autoClear;

    public Settings() {
        autoClear = true;
    }

    @Override
    public void setAutoClear(boolean autoClear) {
        this.autoClear = autoClear;
    }

    @Override
    public boolean isAutoCleared() {
        return autoClear;
    }
}
