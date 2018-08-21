package ca.kwisses.everyday.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ca.kwisses.everyday.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private View view;

    private MainPresenter mainPresenter;
    private MainActivityListener mainActivityListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(android.R.id.content);

        mainPresenter = new MainPresenter(this);
        mainActivityListener = new MainActivityListener(this, view);

        setObjectViews(mainPresenter);
    }

    @Override
    public void setObjectViews(MainPresenter mainPresenter) {
        View optionsButton = findViewById(R.id.optionsButton);
        optionsButton.setOnClickListener(mainActivityListener.getHeaderListener());
    }

}
