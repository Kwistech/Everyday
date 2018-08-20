package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.View;

public class ListListener implements ListenerContract._List {

    private Context context;

    public ListListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onCheckBoxClick(View view) {

    }
}
