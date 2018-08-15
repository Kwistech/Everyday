package ca.kwisses.everyday.splashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ca.kwisses.everyday.R;

public class SplashscreenActivity extends AppCompatActivity {

    private SplashScreenPresenter splashScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        splashScreenPresenter = new SplashScreenPresenter(this);
        splashScreenPresenter.run();
    }
}
