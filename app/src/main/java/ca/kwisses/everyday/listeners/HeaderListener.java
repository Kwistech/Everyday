package ca.kwisses.everyday.listeners;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import ca.kwisses.everyday.R;

public class HeaderListener implements ListenerContract.Header {

    private Context context;
    private PopupMenu popupMenu;

    public HeaderListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        onOptionsMenuClick(v, getContext());
    }

    @Override
    public void onOptionsMenuClick(View view, Context context) {
        ImageButton optionsButton = view.findViewById(R.id.optionsButton);
        popupMenu = new PopupMenu(context, optionsButton);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, popupMenu.getMenu());
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu.show();
            }
        });
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
