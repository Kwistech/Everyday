package ca.kwisses.everyday.listeners;

import android.view.View;

public interface ListenerContract extends View.OnClickListener{

    interface Header {
        void onOptionsMenuClick(View view);
    }

    interface _List {
        void onCheckBoxClick(View view);
    }

    interface Menu {
        void onMenuChoiceClick(View view);
    }

    interface OptionsMenu {
        void onOptionsMenuChoiceClick(View view);
    }

}
