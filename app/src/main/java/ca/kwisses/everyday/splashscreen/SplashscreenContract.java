package ca.kwisses.everyday.splashscreen;

import android.content.Intent;

public interface SplashscreenContract {

    interface View {

    }

    interface Presenter {

        int getContentView();

        Intent getIntent();
    }

}
