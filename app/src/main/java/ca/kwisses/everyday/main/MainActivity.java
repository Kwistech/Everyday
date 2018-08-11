package ca.kwisses.everyday.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.kwisses.everyday.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setObjectViews(MainPresenter mainPresenter) {

    }

    @Override
    public String getViewTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }
}
