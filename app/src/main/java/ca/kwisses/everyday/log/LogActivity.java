package ca.kwisses.everyday.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.kwisses.everyday.dbhandler.DBHandler;

public class LogActivity extends AppCompatActivity implements LogContract.View {

    LogActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_log);
    }

    @Override
    public void setObjectViews() {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public DBHandler getDBHandler() {
        return null;
    }

    @Override
    public void setDBHandler(DBHandler dbHandler) {

    }

    @Override
    public void show() {

    }
}
