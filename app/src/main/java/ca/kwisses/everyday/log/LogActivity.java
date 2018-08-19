package ca.kwisses.everyday.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.kwisses.everyday.dbhandler.DBHandler;

public class LogActivity extends AppCompatActivity implements LogContract.View {

    private String title;
    private DBHandler dbHandler;

    public LogActivity() {

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
        this.title = title;
    }

    @Override
    public DBHandler getDBHandler() {
        return dbHandler;
    }

    @Override
    public void setDBHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @Override
    public void show() {

    }
}
