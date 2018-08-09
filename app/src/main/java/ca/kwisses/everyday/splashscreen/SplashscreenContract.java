package ca.kwisses.everyday.splashscreen;

import android.content.Context;
import android.content.Intent;

public interface SplashscreenContract {

    interface View {

    }

    interface Presenter {

        View getContentView();

        Intent getIntent(Context context);

        void run();

    }

}
