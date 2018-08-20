package ca.kwisses.everyday.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ca.kwisses.everyday.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter mainPresenter;
    private MainActivityListener mainActivityListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
        mainActivityListener = new MainActivityListener(this);
        setObjectViews(mainPresenter);
    }

    @Override
    public void setObjectViews(MainPresenter mainPresenter) {
        View view = findViewById(R.id.optionsButton);
        view.setOnClickListener(mainActivityListener.getHeaderListener());
    }

    @Override
    public String getViewTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }
}
